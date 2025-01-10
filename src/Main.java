package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.15.2 2024-12-26
 */

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        UserInterface userInterface = new UserInterface();
        UserInput input = userInterface.createUserInput();

        while (!input.getStringInput().contains("exit")) {

            if (input.countWords() == 1) {
                UserCommand command = new UserCommand(input);

                if (command.getCommand().contains("help")) {
                    userInterface.showHelp();
                } else if (command.getCommand().contains("exit")) {
                    System.out.println("good buy");
                    return;
                }

            } else if (input.countWords() == 2) {
                System.out.println("two words");
            } else {
                MathExpression expression = new MathExpression(input);
                System.out.println(input.getStringInput() + " = " + calculator.getResult(expression));
            }
            input = userInterface.createUserInput();
        }
    }
}
