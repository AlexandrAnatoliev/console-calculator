package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.3.2 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        UserInterface userInterface = new UserInterface(expression);
        UserInterface.show(expression);

    }
}
