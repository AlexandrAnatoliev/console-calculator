package src;

import java.util.Scanner;

/**
 * To set new math expression by user string input
 * and to parse user string input on elements
 */
public class UserInterface {

    public UserInterface() {
    }

    public UserInput createUserInput() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input math expression or \"help\" command for to get referential information");
        return new UserInput(scan.nextLine());
    }

    /**
     * To output referential information about available commands
     */
    public void showHelp() {
        System.out.println("The following commands are available:");
        System.out.println("help - to get referential information");
        System.out.println("exit - to stop program and exit");
        System.out.println("1 + 2 - addition");
        System.out.println("1 - 2 - subtraction");
        System.out.println("1 * 2 - multiplication");
        System.out.println("1 / 2 - division");
    }

}