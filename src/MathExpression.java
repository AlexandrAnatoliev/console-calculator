package src;

public class MathExpression implements Data {
    private final CommandTypes command = CommandTypes.MATH_EXPRESSION;
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

    /**
     * @return data type
     */
    @Override
    public CommandTypes get() {
        return this.command;
    }

    /**
     * @return first number of math expression
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @return second number of math expression
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @return used operator of math expression
     */
    public Operators getOperator() {
        return operator;
    }
}
