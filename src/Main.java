package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.14.0 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression;
        UserInterface userInterface = new UserInterface();
        Calculator calculator = new Calculator();

        do {
            expression = userInterface.setUserInput();

            if (userInterface.inputIsHelp(expression)) {
                userInterface.showHelp();
                continue;
            }

            if (userInterface.inputIsExit(expression)) {
                return;
            }

            expression = userInterface.parseExpression(expression);
            System.out.println(expression.getUserInput() + " = " + calculator.getResult(expression));
        }
        while (!userInterface.inputIsExit(expression));
    }
}
