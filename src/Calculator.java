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
        if (expression.getOperator() == Operators.MINUS)
            return expression.getNum1() - expression.getNum2();
        if (expression.getOperator() == Operators.PLUS)
            return expression.getNum1() + expression.getNum2();
        if (expression.getOperator() == Operators.TIMES)
            return expression.getNum1() * expression.getNum2();
        if (expression.getOperator() == Operators.DIVISION)
            return expression.getNum1() / expression.getNum2();
        return 0;
    }
}
