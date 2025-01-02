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

        switch (expression.getOperator()) {
            case MINUS -> {
                return expression.getNum1() - expression.getNum2();
            }
            case PLUS -> {
                return expression.getNum1() + expression.getNum2();
            }
            case TIMES -> {
                return expression.getNum1() * expression.getNum2();
            }
            case DIVISION -> {
                return expression.getNum1() / expression.getNum2();
            }
            default -> {
                return 0;
            }
        }
    }
}
