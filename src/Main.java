package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.9.4 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        UserInterface userInterface = new UserInterface();
        userInterface.setUserInput(expression);

        if (userInterface.showHelp(expression)) {
            userInterface.setUserInput(expression);
        }

        userInterface.parseExpression(expression);
        Calculator calculator = new Calculator();
        System.out.println(expression.getUserInput() + " = " + calculator.getResult(expression));

    }
}
