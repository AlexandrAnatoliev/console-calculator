package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.3.0 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        Expression expr = new Expression("hello world");
        expr.setNum1(1);
        expr.setNum2(2);
        expr.setOperation(Operations.PLUS);
        expr.setResult(3);
        System.out.println("Main class run");
        System.out.println(expr.getUserInput());
        System.out.println(expr.getNum1() + " " + expr.getNum2() + " " + expr.getResult());
        System.out.println(expr.getOperation());
        UserInterface.show(UserCommands.HELP);
    }
}
