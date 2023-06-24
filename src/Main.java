import com.sun.source.tree.WhileLoopTree;

import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.showPlayersOptions();
        gameController.init(args[0]);
//        TileFactory factory = new TileFactory();
//        System.out.println("Select a player:");
//        factory.playersListToString();
//        Scanner myScanner = new Scanner(System.in);
//        Integer playerIndex = myScanner.nextInt();
//        Player chosenPlayer = factory.getPlayer(playerIndex - 1);//TODO show players list
//        if (args.length != 1) {
//            System.out.println("error loading level folder");
//            return;
//        } else {
//            File folder = new File(args[0]);
//            File[] listOfFiles = folder.listFiles();
//            for (int i = 0; i < listOfFiles.length; i++) {
//                try {
//
//                    reader = new BufferedReader(new FileReader(listOfFiles[i]));
//                    //load level
//                    gb = new GameBoard(reader, chosenPlayer);
//                    gb.printBoard();
//                    //print board
//                    char c = new Scanner(System.in).next().charAt(0);
//                    while (c == 'd' || c == 'w' || c == 'a' || c == 's') { // need to add isAlive or numberOfenemies > 0
//                        // TICK
//                        gb.printBoard();
//                        c = new Scanner(System.in).next().charAt(0);
//                    }
//
//                    //player action
//
//                    // do move
//
//
//                    //check result
//
//                } catch (FileNotFoundException e) {
//                    System.out.println("Error - file not found:" + listOfFiles[i].getPath());
//                    return;
//                } catch (RuntimeException er) {
//                    System.out.println("Error - runTime exception" + er);
//                }
//
//            }
//        }
    }
}
