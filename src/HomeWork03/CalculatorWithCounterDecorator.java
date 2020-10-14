package HomeWork03;

public class CalculatorWithCounterDecorator extends CalculatorDecorator {
    private ICalculator calculator;
    private long countOperation = 0L; // количество использований калькулятора

    public  CalculatorWithCounterDecorator(ICalculator calculator){
        super(calculator);
        this.calculator = calculator;
    }

    public CalculatorWithCounterDecorator(){
        super();
        this.calculator = new CalculatorWithMathExtends();
    }

    /**
     * Метод, инкрементирующий количество использования калькулятора на 1.
     * Вызывается при выполнении любой из операций.
     */
    private void setCountOperation(){
        this.countOperation++;
    }

    /**
     * Метод для получения количество использований калькулятора
     * @return значение - сколько раз использовался калькулятор
     */
    public long getCountOperation(){
        return countOperation;
    }


    //Арифметические методы
    @Override
    public double addition(double add1, double add2) {
        setCountOperation();
        return super.addition(add1, add2);
    }

    @Override
    public double addition(int add1, double add2) {
        setCountOperation();
        return super.addition(add1, add2);
    }

    @Override
    public double addition(double add1, int add2) {
        setCountOperation();
        return super.addition(add1, add2);
    }

    @Override
    public double addition(int add1, int add2) {
        setCountOperation();
        return super.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        setCountOperation();
        return super.subtraction(dec, sub);
    }

    @Override
    public double subtraction(int dec, double sub) {
        setCountOperation();
        return super.subtraction(dec, sub);
    }

    @Override
    public double subtraction(double dec, int sub) {
        setCountOperation();
        return super.subtraction(dec, sub);
    }

    @Override
    public double subtraction(int dec, int sub) {
        setCountOperation();
        return super.subtraction(dec, sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        setCountOperation();
        return super.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, double mul2) {
        setCountOperation();
        return super.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(double mul1, int mul2) {
        setCountOperation();
        return super.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, int mul2) {
        setCountOperation();
        return super.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        setCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, double divisor) {
        setCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double division(double divisible, int divisor) {
        setCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, int divisor) {
        setCountOperation();
        return super.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        setCountOperation();
        return super.power(base, degree);
    }

    @Override
    public double power(int base, int degree) {
        setCountOperation();
        return super.power(base, degree);
    }

    @Override
    public double module(double number) {
        setCountOperation();
        return super.module(number);
    }

    @Override
    public double module(int number) {
        setCountOperation();
        return super.module(number);
    }

    @Override
    public double root(double number, int radical) {
        setCountOperation();
        return super.root(number, radical);
    }

    @Override
    public double root(int number, int radical) {
        setCountOperation();
        return super.root(number, radical);
    }

}
