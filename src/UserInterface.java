package src;

import java.util.Scanner;

/**
 * To set new math expression by user string input
 * and to parse user string input on elements
 */
public class UserInterface {

    public UserInterface() {
    }

    /**
     * To set new math expression by user string input
     *
     * @return New expression contains user string input
     */
    public Expression setUserInput() {
        Scanner scan = new Scanner(System.in);
        Expression expression;
        expression = new Expression();
        System.out.println("Input math expression or \"help\" command for to get referential information");
        expression.setUserInput(scan.nextLine());
        return expression;
    }

    /**
     * If user input contains "exit" command, then return "true"
     *
     * @param expression Contains user input
     * @return true if user input contains "help" commands
     */
    public boolean inputIsHelp(Expression expression) {
        return expression.getUserInput().contains("help");
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

    /**
     * To help stop the program and exit
     * If user input contains "exit" command, then return "true"
     * and outputs message about it
     *
     * @param expression User input
     * @return true if user input contains "exit" command
     */
    public boolean inputIsExit(Expression expression) {
        if (expression.getUserInput().contains("exit")) {
            System.out.println("Exit from the program");
            return true;
        }
        return false;
    }

    /**
     * To parse user string input on elements
     *
     * @param oldExpression Old expression contains user input in string
     * @return New expression contains separate elements of math expression
     */
    public Expression parseExpression(Expression oldExpression) {
        Expression newExpression;
        newExpression = new Expression();
        newExpression.setUserInput(oldExpression.getUserInput());
        newExpression.setWords(newExpression.getUserInput().split(" "));
        newExpression.setNum1(Double.parseDouble(newExpression.getWords()[0]));
        newExpression.setNum2(Double.parseDouble(newExpression.getWords()[2]));

        switch (newExpression.getWords()[1]) {
            case "+" -> newExpression.setOperator((Operators.PLUS));
            case "-" -> newExpression.setOperator((Operators.MINUS));
            case "*" -> newExpression.setOperator((Operators.TIMES));
            case "/" -> newExpression.setOperator((Operators.DIVISION));
            default -> System.out.println("Неверный оператор " + newExpression.getWords()[1]);
        }
        return newExpression;
    }
}