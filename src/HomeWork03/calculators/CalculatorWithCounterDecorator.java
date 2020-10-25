package HomeWork03.calculators;

public class CalculatorWithCounterDecorator extends CalculatorDecorator {
    /**
     * количество использований калькулятора
     */
    private long countOperation = 0L;

    public  CalculatorWithCounterDecorator(ICalculator calculator){
        super(calculator);
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
        return this.countOperation;
    }


    //Арифметические методы
    @Override
    public double addition(double add1, double add2) {
        incrementCountOperation();
        return super.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        incrementCountOperation();
        return super.subtraction(dec, sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        incrementCountOperation();
        return super.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        incrementCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        incrementCountOperation();
        return super.power(base, degree);
    }

    @Override
    public double module(double number) {
        incrementCountOperation();
        return super.module(number);
    }

    @Override
    public double root(double number, int radical) {
        incrementCountOperation();
        return super.root(number, radical);
    }

}
