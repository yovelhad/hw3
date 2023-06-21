import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GameBoard {
    private Tile[][] BoardTiles;
    private  TileFactory factory;
    private  Player activePlayer;

    public GameBoard(BufferedReader reader, Player activePlayer){
        String line;
        this.activePlayer = activePlayer;
        factory = new TileFactory();
        factory.setPlayer(activePlayer);
        List<String> boardString = new ArrayList<>();
        try {
            while ((line = reader.readLine()) != null) {
                boardString.add(line);
                //System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       // System.out.println("Build board:");
        Integer xAxis = boardString.get(0).length();
        Integer yAxis = boardString.size();
        this.BoardTiles = new Tile[yAxis][xAxis];
        for (int i =0; i< yAxis; i++){
            line = boardString.get(i);
            for (int j = 0; j<xAxis;j++ ){
                Position tilePosition = new Position(j,i);
                BoardTiles[i][j] = factory.getTile(line.charAt(j),tilePosition);
            }
        }
    }

    public Tile get(int x, int y) {
        if(x < BoardTiles[0].length && y < BoardTiles.length )
            return BoardTiles[y][x];
        else
        // Throw an exception if no such tile.
        throw new NoSuchElementException("No such tile exist.");
    }

    public void remove(Enemy e) {
        Position p = e.getPosition();
        Empty toReplace =  factory.produceEmpty(p);
        BoardTiles[p.getY()][p.getX()] = toReplace;
    }

    public void printBoard() {
        for (int i =0; i< BoardTiles.length; i++){
            Tile[] line= BoardTiles[i];
            for (int j = 0; j<line.length; j++ ){
                System.out.print(BoardTiles[i][j].getSymbol());
            }
            System.out.println();
        }

    }

}
