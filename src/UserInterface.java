package src;

import java.util.Objects;
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
    public boolean showHelp(Expression expression) {
        if (expression.getUserInput().contains("help")) {
            System.out.println("Доступны следующие команды");
            System.out.println("help - получение справки");
            System.out.println("1 + 2 - сложение");
            System.out.println("1 - 2 - вычитание");
            System.out.println("1 * 2 - умножение");
            System.out.println("1 / 2 - деление");
            return true;
        }
        return false;
    }


    /**
     * Метод, парсящий введенное в виде строки выражение пользователя на отдельные элементы
     *
     * @param expression Экземпляр класса Expression, содержащий пользовательский ввод
     */
    public void parseExpression(Expression expression) {
        expression.setWords(expression.getUserInput().split(" "));
        expression.setNum1(Double.parseDouble(expression.getWords()[0]));
        expression.setNum2(Double.parseDouble(expression.getWords()[2]));

        switch (expression.getWords()[1]) {
            case "+" -> expression.setOperator((Operators.PLUS));
            case "-" -> expression.setOperator((Operators.MINUS));
            case "*" -> expression.setOperator((Operators.TIMES));
            case "/" -> expression.setOperator((Operators.DIVISION));
            default -> System.out.println("Неверный оператор " + expression.getWords()[1]);
        }
    }
}