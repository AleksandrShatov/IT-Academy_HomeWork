package HomeWork03;

public class CalculatorDecorator implements ICalculator {
    private ICalculator calculator;

    public  CalculatorDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public CalculatorDecorator(){
        this.calculator = new CalculatorWithMathExtends();
    }

    public ICalculator getCalculator(){
        return calculator;
    }

    //Арифметические методы
    @Override
    public double addition(double add1, double add2) {
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(int add1, double add2) {
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(double add1, int add2) {
        return calculator.addition(add1, add2);
    }

    @Override
    public double addition(int add1, int add2) {
        return calculator.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        return calculator.subtraction(dec , sub);
    }

    @Override
    public double subtraction(int dec, double sub) {
        return calculator.subtraction(dec , sub);
    }

    @Override
    public double subtraction(double dec, int sub) {
        return calculator.subtraction(dec , sub);
    }

    @Override
    public double subtraction(int dec, int sub) {
        return calculator.subtraction(dec , sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, double mul2) {
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(double mul1, int mul2) {
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double multiplication(int mul1, int mul2) {
        return calculator.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, double divisor) {
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(double divisible, int divisor) {
        return calculator.division(divisible, divisor);
    }

    @Override
    public double division(int divisible, int divisor) {
        return calculator.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        return calculator.power(base, degree);
    }

    @Override
    public double power(int base, int degree) {
        return calculator.power(base, degree);
    }

    @Override
    public double module(double number) {
        return calculator.module(number);
    }

    @Override
    public double module(int number) {
        return calculator.module(number);
    }

    @Override
    public double root(double number, int radical) {
        return calculator.root(number, radical);
    }

    @Override
    public double root(int number, int radical) {
        return calculator.root(number, radical);
    }
}