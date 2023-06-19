import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader;
        GameBoard gb;
        TileFactory factory = new TileFactory();
        Player p1 = factory.listPlayers().get(0);//TODO show players list
        if (args.length != 1){
            System.out.println("error loading level folder");
            return;
        } else {
            File folder = new File(args[0]);
            File[] listOfFiles = folder.listFiles();
            for (int i = 0; i < listOfFiles.length; i++) {
                try {
                    reader = new BufferedReader(new FileReader(listOfFiles[i]));
                    //load level
                    gb = new GameBoard(reader,p1);
                    System.out.printf(gb.toString());
                    //print board

                    //player action

                    // do move


                    //check result

                } catch (FileNotFoundException e) {
                    System.out.println("Error - file not found:"+listOfFiles[i].getPath());
                    return;
                }
                catch (RuntimeException er){
                    System.out.println("Error - runTime exception" + er);
                }

            }
        }

        System.out.println("Welcome to Azaroth!");

        Position p2 = new Position(1,3);
        Position p3 = new Position(1,4);
        Position p4 = new Position(1,5);
//        Unit pr1 = new Player("shooki");
//        Unit e1 = new Enemy();
//        Tile w1 = new Wall();
//        Tile emp1 = new Empty();
//        pr1.interact(e1);
//        pr1.interact(emp1);
//        pr1.interact(w1);

    }


}