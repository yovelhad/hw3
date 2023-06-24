import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class LevelParser {
    private List<Level> gameLevels;
    private Integer currentLevelIndex;
    public LevelParser(File[] levelFiles, Player chosenPlayer) {
        gameLevels = new ArrayList<>();
        for (int i = 0; i < levelFiles.length; i++) {
            List<String> currentLevelString = readAllLines(levelFiles[i].getPath());
            Level currentLevel = new Level(currentLevelString,chosenPlayer);
            gameLevels.add(currentLevel);
        }
        currentLevelIndex = 0;
    }
    public Level nextLevel(){
        Level levelToReturn = gameLevels.get(currentLevelIndex);
        currentLevelIndex += 1;
        return levelToReturn;
    }

    public List<String> readAllLines(String path){
        List<String> lines = Collections.emptyList();
        try{
            lines = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.printf(e.getMessage() + "\n" + e.getStackTrace());
        }
        return lines;
    }

    public List<Level> getLevels() {
        return gameLevels;
    }
    public String printCurrentLevel() {
        Level currentLevel = gameLevels.get(currentLevelIndex);
        return currentLevel.showBoard();
    }

}
