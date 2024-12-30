package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.5.1 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expression = new Expression();
        UserInterface userInterface = new UserInterface(expression);

        if (userInterface.showHelp(expression))
            System.out.println("введите еще раз");

        userInterface.parseExpression(expression);
        Calculator calculator = new Calculator();
        System.out.println(calculator.getResult(expression));

    }
}
