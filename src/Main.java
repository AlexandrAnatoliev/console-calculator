package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.14.5 2024-12-26
 */

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        UserInterface userInterface = new UserInterface();
        UserInput input = userInterface.createUserInput();

        while (!input.getStringInput().contains("exit")) {

            if (input.countWords() == 1) {
                OneWord command = new OneWord(input);

                if (command.getCommand().contains("help")) {
                    userInterface.showHelp();
                } else if (command.getCommand().contains("exit")) {
                    System.out.println("good buy");
                    return;
                }

            } else if (input.countWords() == 2) {
                System.out.println("two words");
            } else {
                ThreeWords expression = new ThreeWords(input);
                System.out.println(input.getStringInput() + " = " + calculator.getResult(expression));
            }
            input = userInterface.createUserInput();
        }
         /*        Expression expression;
         UserInterface userInterface = new UserInterface();
         Calculator calculator = new Calculator();

         do {
         expression = userInterface.setUserInput();

         if (userInterface.inputIsHelp(expression)) {
         userInterface.showHelp();
         continue;
         }

         if (userInterface.inputIsExit(expression)) {
         return;
         }

         expression = userInterface.parseExpression(expression);
         System.out.println(expression.getUserInput() + " = " + calculator.getResult(expression));
         }
         while (!userInterface.inputIsExit(expression));
         */
    }
}
