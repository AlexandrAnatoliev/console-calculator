package src;

import java.util.Scanner;

/**
 * Класс UserInterface создает объект Expression, принимает из консоли ввод пользователя
 * распарсивает его на элементы, возвращает пользователю вычисленный ответ
 * при необходимости выводит сообщения об ошибке и справку для пользователя об использовании программы
 */

public class UserInterface {
    private Expression expression;
    private Scanner scan;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        System.out.println("Введите вычисляемое выражение");
        this.expression = new Expression(scan.nextLine());
    }

    public static void show(UserCommands command) {
        if (command == UserCommands.HELP) {
            System.out.println("Доступны следующие команды");
            System.out.println("HELP - получение справки");
        }
    }
}