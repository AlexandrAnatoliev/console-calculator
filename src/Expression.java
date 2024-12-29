package src;

/**
 * Класс Expression содержит вводимое пользователем математическое выражение в виде исходной строки;
 * распарсенные значения членов выражения, название математической операции и вычисленный результат
 */

public class Expression {
    private String userInput;
    private double num1;
    private double num2;
    private Operators operator;
    private double result;

    public Expression() {
    }

    /**
     * @param input Выражение, вводимое пользователем в виде исходной строки
     */
    public Expression(String input) {
        this.userInput = input;
    }

    /**
     * @param userInput Вводимое пользователем выражение в виде строки
     */
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    /**
     * @param num1 Первое число выражения
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @param num2 Второе число выражения
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @param operator Вид выполняемой математической операции
     */
    public void setOperator(Operators operator) {
        this.operator = operator;
    }

    /**
     * @param result Результат вычисления выражения
     */
    public void setResult(double result) {
        this.result = result;
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

    public double getResult() {
        return result;
    }

    public String getUserInput() {
        return userInput;
    }

}
