import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GameController {
    private CLI cli;
    private LevelParser levelparser;
    private Game game;
    private TileFactory tileFactory;
    public GameController(){
        this.cli = new CLI();
        tileFactory = new TileFactory();
    }
    public void init(String levelsPath){
        File folder = new File(levelsPath);
        File[] listOfFiles = folder.listFiles();
        this.levelparser = new LevelParser(listOfFiles,game.getChosenPlayer());
        game.SetLevelsList(levelparser.getLevels());
        runGame();
    }

    private void runGame() {
        cli.print(levelparser.printCurrentLevel());
        while(game.isActive()){
           Character actionChar = cli.getMessage();
           while(!cli.isValidActionChar(actionChar)) {
               actionChar = cli.getMessage();
           }
            cli.doSomething(actionChar);
            cli.print(levelparser.printCurrentLevel());

        }

    }

    public void showPlayersOptions(){
        cli.print(tileFactory.playersListToString());
        Character chosenPlayerChar =  cli.getMessage();
        while(!cli.isValidPlayerIndex(chosenPlayerChar)) {
            chosenPlayerChar = cli.getMessage();
        }
        game = new Game(Character.getNumericValue(chosenPlayerChar) -1 );
    }
    public void shutDown(){

    }


}
