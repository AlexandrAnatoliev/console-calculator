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

    /**
     * Конструктор класса UserInterface
     * Запрашивает у пользователя вычисляемое выражение в виде строки и сохраняет его
     *
     * @param expression Экземпляр класса Expression, содержащего вычисляемое выражение
     */
    public UserInterface(Expression expression) {
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
        if (expression.getUserInput().equals("help")) {
            System.out.println("Доступны следующие команды");
            System.out.println("help - получение справки");
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
        if (Objects.equals(expression.getWords()[1], "+")) {
            expression.setOperator(Operators.PLUS);
        }
        if (Objects.equals(expression.getWords()[1], "-")) {
            expression.setOperator(Operators.MINUS);
        }
    }
}