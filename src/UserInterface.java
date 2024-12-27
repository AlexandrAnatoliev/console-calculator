package src;

import java.util.Scanner;

/**
 * Класс UserInterface создает объект Expression, принимает из консоли ввод пользователя
 * распарсивает его на элементы, возвращает пользователю вычисленный ответ
 * при необходимости выводит сообщения об ошибке и справку для пользователя об использовании программы
 */

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("UserInterface class run");
    }

    public static void show(UserCommands command) {
        if (command == UserCommands.HELP) {
            System.out.println("Доступны следующие команды");
            System.out.println("HELP - получение справки");
        }
    }
}