package src;

/**
 * Класс Calculator будет принимать уже распарсенный объект Expression
 * и возвращать результат вычисления выражения
 */

public class Calculator {
    public Calculator() {
    }

    /**
     * To compute expression result
     *
     * @param expression Contains math expression
     * @return Expression result or "NullPointerException" if math operator is not correct
     */
    public double getResult(Expression expression) {

        return switch (expression.getOperator()) {
            case MINUS -> expression.getNum1() - expression.getNum2();
            case PLUS -> expression.getNum1() + expression.getNum2();
            case TIMES -> expression.getNum1() * expression.getNum2();
            case DIVISION -> expression.getNum1() / expression.getNum2();
        };
    }
}
