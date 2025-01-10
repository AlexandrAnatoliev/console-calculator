package src;

public class MathExpression implements Data {
    private final String[] words;
    private final double num1;
    private final double num2;
    private final Operators operator;

    public MathExpression(UserInput input) {
        this.words = input.getStringInput().split(" ");
        this.num1 = Double.parseDouble(words[0]);
        this.num2 = Double.parseDouble(words[2]);
        this.operator = switch (words[1]) {
            case "+" -> Operators.PLUS;
            case "-" -> Operators.MINUS;
            case "*" -> Operators.TIMES;
            case "/" -> Operators.DIVISION;
            default -> throw new IllegalStateException("Unexpected value: " + words[1]);
        };
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
}
