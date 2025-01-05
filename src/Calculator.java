package src;

/**
 * Класс Calculator будет принимать уже распарсенный объект Expression
 * и возвращать результат вычисления выражения
 */

public class Calculator {
    public Calculator() {
    }

    /**
     * Метод, вычисляющий результат выражения
     *
     * @param expression Вычисляемое выражение
     * @return Результат вычисления
     */
    public double getResult(Expression expression) {

        return switch (expression.getOperator()) {
            case MINUS -> expression.getNum1() - expression.getNum2();
            case PLUS -> expression.getNum1() + expression.getNum2();
            case TIMES -> expression.getNum1() * expression.getNum2();
            case DIVISION -> expression.getNum1() / expression.getNum2();
            default -> 0;
        };
    }
}
