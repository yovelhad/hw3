import java.util.List;

public class Game {
    List<Level> levelsList;
    Player chosenPlayer;
    TileFactory tileFactory;
    boolean alive;
    public Game(Integer playerIndex){
        tileFactory = new TileFactory();
        chosenPlayer = tileFactory.getPlayer(playerIndex);
        tileFactory.setPlayer(chosenPlayer);
        alive = true;
    }
    public void SetLevelsList(List<Level> levelsList){
        this.levelsList = levelsList;
    }
    public Player getChosenPlayer(){
        return chosenPlayer;
    }

    public boolean isActive() {
        return  alive;
    }

}
