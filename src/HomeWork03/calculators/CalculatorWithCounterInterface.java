package HomeWork03.calculators;

public class CalculatorWithCounterInterface implements ICalculator {
    /**
     * количество использований калькулятора
     */
    private long countOperation = 0L;

    private final ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    /**
     * Метод, инкрементирующий количество использования калькулятора на 1.
     * Вызывается при выполнении любой из операций.
     */
    private void incrementCountOperation(){
        this.countOperation++;
    }

    /**
     * Метод для получения количество использований калькулятора
     * @return значение - сколько раз использовался калькулятор
     */
    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public double addition(double add1, double add2) {
        incrementCountOperation();
        return calculator.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        incrementCountOperation();
        return calculator.subtraction(dec, sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        incrementCountOperation();
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return calculator.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        incrementCountOperation();
        return calculator.power(base, degree);
    }

    @Override
    public double module(double number) {
        incrementCountOperation();
        return calculator.module(number);
    }

    @Override
    public double root(double number, int radical) {
        incrementCountOperation();
        return calculator.root(number, radical);
    }

}