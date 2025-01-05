package src;


/**
 * Contains math expression
 */
public class Expression {
    private String userInput;
    private String[] words;
    private double num1;
    private double num2;
    private Operators operator;

    public Expression() {
    }

    /**
     * @param userInput Contains user input in string
     */
    public Expression(String userInput) {
        this.userInput = userInput;
    }

    /**
     * @param userInput Contains user input in string
     */
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    /**
     * @param words Contains user input in separate words
     */
    public void setWords(String[] words) {
        this.words = words;
    }

    /**
     * @param num1 Contains first number expression
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @param num2 Contains second number expression
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @param operator Contains math operation
     */
    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    public String[] getWords() {
        return words;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Operators getOperator() {
        return operator;
    }

    public String getUserInput() {
        return userInput;
    }

}
