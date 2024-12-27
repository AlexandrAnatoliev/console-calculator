package src;

/**
 * Класс Expression содержит вводимое пользователем математическое выражение в виде исходной строки;
 * распарсенные значения членов выражения, название математической операции и вычисленный результат
 */

public class Expression {
    private String userInput;
    private double num1;
    private double num2;
    private Operations operation;
    private double result;

    public Expression(String input) {
        this.userInput = input;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public void setOperation(Operations operation) {
        this.operation = operation;
    }

    public void setResult(double result) {
        this.result = result;
    }


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Operations getOperation() {
        return operation;
    }

    public double getResult() {
        return result;
    }

    public String getUserInput() {
        return userInput;
    }

}
