package src;

import java.util.Scanner;

/**
 * Класс UserInterface создает объект Expression, принимает из консоли ввод пользователя
 * распарсивает его на элементы, возвращает пользователю вычисленный ответ
 * при необходимости выводит сообщения об ошибке и справку для пользователя об использовании программы
 */

public class UserInterface {
    private Scanner scan;

    public UserInterface() {
        this.scan = null;
    }

    /**
     * Метод для ввода вычисляемого выражения пользователем
     *
     * @param expression Экземпляр класса Expression содержащий пользовательский ввод
     */
    public void setUserInput(Expression expression) {
        this.scan = new Scanner(System.in);
        System.out.println("Введите вычисляемое выражение");
        expression.setUserInput(scan.nextLine());
    }

    /**
     * Метод выводящий справку о командах, доступных пользователю
     *
     * @param expression Экземпляр класса Expression содержащий пользовательский ввод
     * @return Возвращает true в случае, если пользователь запросил справку, иначе - false
     */
    public boolean inputIsHelp(Expression expression) {
        if (expression.getUserInput().contains("help")) {
            System.out.println("The following commands are available:");
            System.out.println("help - to get referential information");
            System.out.println("exit - to stop program and exit");
            System.out.println("1 + 2 - addition");
            System.out.println("1 - 2 - subtraction");
            System.out.println("1 * 2 - multiplication");
            System.out.println("1 / 2 - division");
            return true;
        }
        return false;
    }

    /**
     * Stop the program and exit
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