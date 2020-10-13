package HomeWork03;

public class CalculatorWithCounterInterface implements ICalculator {
    private long countOperation = 0L;

    private ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    public CalculatorWithCounterInterface(){
        this(new CalculatorWithOperator());
    }

    private void setCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

    @Override
    public double addition(double add1, double add2) {
        setCountOperation();
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(int add1, double add2) {
        setCountOperation();
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(double add1, int add2) {
        setCountOperation();
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(int add1, int add2) {
        setCountOperation();
        return calculator.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        setCountOperation();
        return calculator.subtraction(dec, sub);
    }

    @Override
    public double subtraction(int dec, double sub) {
        setCountOperation();
        return calculator.subtraction(dec, sub);
    }

    @Override
    public double subtraction(double dec, int sub) {
        setCountOperation();
        return calculator.subtraction(dec, sub);
    }

    @Override
    public double subtraction(int dec, int sub) {
        setCountOperation();
        return calculator.subtraction(dec, sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        setCountOperation();
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, double mul2) {
        setCountOperation();
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(double mul1, int mul2) {
        setCountOperation();
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, int mul2) {
        setCountOperation();
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        setCountOperation();
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, double divisor) {
        setCountOperation();
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(double divisible, int divisor) {
        setCountOperation();
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, int divisor) {
        setCountOperation();
        return calculator.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        setCountOperation();
        return calculator.power(base, degree);
    }

    @Override
    public double power(int base, int degree) {
        setCountOperation();
        return calculator.power(base, degree);
    }

    @Override
    public double module(double number) {
        setCountOperation();
        return calculator.module(number);
    }

    @Override
    public double module(int number) {
        setCountOperation();
        return calculator.module(number);
    }

    @Override
    public double root(double number, int radical) {
        setCountOperation();
        return calculator.root(number, radical);
    }

    @Override
    public double root(int number, int radical) {
        setCountOperation();
        return calculator.root(number, radical);
    }
}