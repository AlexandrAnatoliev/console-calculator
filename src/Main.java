package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.16.5 2025-01-10
 */

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        UserInterface userInterface = new UserInterface();
        UserInput input = userInterface.createUserInput();

        while (!input.getStringInput().contains("exit")) {

            Data data = Data.of(input);
            if (data.get() == CommandTypes.HELP) {
                userInterface.showHelp();
            } else if (data.get() == CommandTypes.EXIT) {
                System.out.println("stop program");
                return;
            } else {
                MathExpression expression = (MathExpression) data;
                System.out.println(input.getStringInput() + " = " + calculator.getResult(expression));
            }
            input = userInterface.createUserInput();
        }
    }
}
