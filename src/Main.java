package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.12.1 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        UserInterface userInterface = new UserInterface();

        do {
            expression = userInterface.setUserInput();

            if (userInterface.inputIsHelp(expression)) {
                continue;
            }

            if (userInterface.inputIsExit(expression)) {
                return;
            }

            expression = userInterface.parseExpression(expression);
            Calculator calculator = new Calculator();
            System.out.println(expression.getUserInput() + " = " + calculator.getResult(expression));
        }
        while (!userInterface.inputIsExit(expression));
    }
}
