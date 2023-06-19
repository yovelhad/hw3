import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GameBoard {
    private List<Tile> tiles;
    private  TileFactory factory;
    private  Player activePlayer;

    public GameBoard(Tile[][] board){
        tiles = new ArrayList<>();
        for(Tile[] line : board){
            tiles.addAll(Arrays.asList(line));
        }
    }
    public GameBoard(BufferedReader reader, Player activePlayer){
        String line;
        this.activePlayer = activePlayer;
        factory = new TileFactory();
        factory.setPlayer(activePlayer);
        System.out.println("READ FILE:");
        List<String> boardString = new ArrayList<>();
        try {
            while ((line = reader.readLine()) != null) {
                boardString.add(line);
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Build board:");
        Integer xAxis = boardString.get(0).length();
        Integer yAxis = boardString.size();
        Tile[][] gameBoard = new Tile[yAxis][xAxis];
        for (int i =0; i< yAxis; i++){
            line = boardString.get(i);
            for (int j = 0; j<xAxis;j++ ){
                Position tilePosition = new Position(j,i);
                gameBoard[i][j] = factory.getTile(line.charAt(j),tilePosition);
            }
        }
    }

    public Tile get(int x, int y) {
        for(Tile t : tiles){
            if (t.getPosition().equals(Position.at(x, y))){
                return t;
            }
        }
        // Throw an exception if no such tile.
        throw new NoSuchElementException("No such tile exist.");
    }

    public void remove(Enemy e) {
        tiles.remove(e);
        Position p = e.getPosition();
        tiles.add(new Empty(p));
    }

    @Override
    public String toString() {
        tiles = tiles.stream().sorted().collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        int maxX = 0;
        int maxY = 0;

        // Find the maximum x and y coordinates
        for (Tile tile : tiles) {
            Position position = tile.getPosition();
            if (position.getX() > maxX) {
                maxX = position.getX();
            }
            if (position.getY() > maxY) {
                maxY = position.getY();
            }
        }

        // Generate the string representation of the board
        for (int y = 0; y <= maxY; y++) {
            for (int x = 0; x <= maxX; x++) {
                Tile tile = get(x, y);
                stringBuilder.append(tile.getSymbol());
            }
            stringBuilder.append("\n");
        }

        return stringBuilder.toString();
    }
}
