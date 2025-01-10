package src;

/**
 * console-calculator
 *
 * @author AlexandrAnatoliev
 * @version 0.14.4 2024-12-26
 */

public class Main {
    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();
        UserInput input = userInterface.createUserInput();

        if (input.countWords() == 1) {
            OneWord command = new OneWord(input);

            if (command.getCommand().contains("help")) {
                userInterface.showHelp();
            }
            if (command.getCommand().contains("exit")) {
                System.out.println("good buy");
                return;
            }

        } else if (input.countWords() == 2) {
            System.out.println("two words");
        } else {
            ThreeWords ex = new ThreeWords(input);
            System.out.println(ex.getNum1());
            System.out.println(ex.getNum2());
            System.out.println(ex.getOperator());
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
