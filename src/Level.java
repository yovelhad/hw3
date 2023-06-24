import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Level {
    private Tile[][] board;
    private List<Tile> enemyList;
    private Player activePlayer;
    public Level(List<String> levelString, Player activePlayer){
        enemyList = new ArrayList<>();
        String line;
        this.activePlayer = activePlayer;
        TileFactory factory = new TileFactory();
        factory.setPlayer(activePlayer);
        Integer xAxis = levelString.get(0).length();
        Integer yAxis = levelString.size();
        this.board = new Tile[yAxis][xAxis];
        for (int i =0; i< yAxis; i++){
            line = levelString.get(i);
            for (int j = 0; j<xAxis;j++ ){
                Position tilePosition = new Position(j,i);
                Tile toAdd = factory.getTile(line.charAt(j),tilePosition);
                if(toAdd.getSymbol() != '@' && toAdd.getSymbol() != '#' && toAdd.getSymbol() != '.')
                    enemyList.add(toAdd);
                board[i][j] = factory.getTile(line.charAt(j),tilePosition);
            }
        }


    }

    public String showBoard() {
        String boardString = "";
        for (int i =0; i< board.length; i++){
            Tile[] line = board[i];
            for (int j = 0; j<line.length; j++ ){
                boardString += board[i][j].getSymbol();
            }
            boardString += "\n";
        }
        return boardString;
    }
}













