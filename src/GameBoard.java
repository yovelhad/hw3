import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class GameBoard {
    private List<Tile> tiles;

    public GameBoard(Tile[][] board){
        tiles = new ArrayList<>();
        for(Tile[] line : board){
            tiles.addAll(Arrays.asList(line));
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
