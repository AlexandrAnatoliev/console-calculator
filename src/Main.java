package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.3.5 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        UserInterface userInterface = new UserInterface(expression);


        if (UserInterface.showHelp(expression))
            System.out.println("введите еще раз");


    }
}
