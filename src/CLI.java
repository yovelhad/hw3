import java.util.Scanner;

public class CLI {
    Scanner scanner;
    public CLI(){
        scanner = new Scanner(System.in);
    }
    public Character getMessage(){
        scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
    public void doSomething(Character input) {
            processCommand(input);
    }
//    public void printBoard(String input) {
//        input = scanner.nextLine();
//        processCommand(input.charAt(0));
//    }
    public void print(String message) {
        System.out.println(message);
    }

    private void processCommand(Character command) {
        // Process the command and perform necessary actions
        ActionsFactory actionsFactory = new ActionsFactory();
        switch (command) {
            case 'w':
                moveUp(actionsFactory);
                break;
            case 'a':
                moveLeft(actionsFactory);
                break;
            case 's':
                moveDown(actionsFactory);
                break;
            case 'd':
                moveRight(actionsFactory);
                break;
            case 'e':
                specialAbility(actionsFactory);
                break;
            default:
                System.out.println("Unknown command: " + command);
        }
    }

    private static void moveUp( ActionsFactory actionsFactory) {
        actionsFactory.up();
        System.out.println("Player move up.");
    }

    private static void moveLeft( ActionsFactory actionsFactory) {
        actionsFactory.left();
        System.out.println("Player move left");
    }

    private static void moveDown( ActionsFactory actionsFactory) {
        actionsFactory.down();
        System.out.println("Player move down.");
    }

    private static void moveRight( ActionsFactory actionsFactory) {
        actionsFactory.right();
        System.out.println("Player move right.");
        // Display the contents of the player's inventory
    }
    private static void specialAbility( ActionsFactory actionsFactory) {
        actionsFactory.ability();
        System.out.println("Special Ability");
        // Display the contents of the player's inventory
    }


    public boolean isValidActionChar(Character actionChar) {
        boolean isValid = true;
        if(actionChar == null || (actionChar != 'w' && actionChar != 'a' && actionChar != 's' && actionChar != 'd' && actionChar != 'e')){
            isValid = false;
        }
        return isValid;
    }
    public boolean isValidPlayerIndex(Character actionChar) {
        boolean isValid = true;
        if(actionChar == null || (actionChar != '1' && actionChar != '2' && actionChar != '3' && actionChar != '4' && actionChar != '5' && actionChar != '6')){
            isValid = false;
        }
        return isValid;
    }
}
