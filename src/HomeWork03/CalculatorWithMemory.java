package HomeWork03;

public class CalculatorWithMemory implements ICalculator {
    private double memory = 0.0;

    private ICalculator calculator;

    public CalculatorWithMemory(ICalculator calculator){
        this.calculator = calculator;
    }

    public CalculatorWithMemory(){
        this(new CalculatorWithOperator());
    }

    private void setMemory(double value){
        this.memory = value;
    }

    public double getMemory(){
        double tmpMem = this.memory;
        this.memory = 0.0;
        return tmpMem;
    }

    @Override
    public double addition(double add1, double add2) {
        double result = calculator.addition(add1, add2);
        setMemory(result);
        return result;
    }

    @Override
    public double addition(int add1, double add2) {
        double result = calculator.addition(add1, add2);
        setMemory(result);
        return result;
    }

    @Override
    public double addition(double add1, int add2) {
        double result = calculator.addition(add1, add2);
        setMemory(result);
        return result;
    }

    @Override
    public double addition(int add1, int add2) {
        double result = calculator.addition(add1, add2);
        setMemory(result);
        return result;
    }

    @Override
    public double subtraction(double dec, double sub) {
        double result = calculator.subtraction(dec , sub);
        setMemory(result);
        return result;
    }

    @Override
    public double subtraction(int dec, double sub) {
        double result = calculator.subtraction(dec , sub);
        setMemory(result);
        return result;
    }

    @Override
    public double subtraction(double dec, int sub) {
        double result = calculator.subtraction(dec , sub);
        setMemory(result);
        return result;
    }

    @Override
    public double subtraction(int dec, int sub) {
        double result = calculator.subtraction(dec , sub);
        setMemory(result);
        return result;
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        double result = calculator.multiplication(mul1, mul2);
        setMemory(result);
        return result;
    }

    @Override
    public double multiplication(int mul1, double mul2) {
        double result = calculator.multiplication(mul1, mul2);
        setMemory(result);
        return result;
    }

    @Override
    public double multiplication(double mul1, int mul2) {
        double result = calculator.multiplication(mul1, mul2);
        setMemory(result);
        return result;
    }

    @Override
    public double multiplication(int mul1, int mul2) {
        double result = calculator.multiplication(mul1, mul2);
        setMemory(result);
        return result;
    }

    @Override
    public double division(double divisible, double divisor) {
        double result = calculator.division(divisible, divisor);
        setMemory(result);
        return result;
    }

    @Override
    public double division(int divisible, double divisor) {
        double result = calculator.division(divisible, divisor);
        setMemory(result);
        return result;
    }

    @Override
    public double division(double divisible, int divisor) {
        double result = calculator.division(divisible, divisor);
        setMemory(result);
        return result;
    }

    @Override
    public double division(int divisible, int divisor) {
        double result = calculator.division(divisible, divisor);
        setMemory(result);
        return result;
    }

    @Override
    public double power(double base, int degree) {
        double result = calculator.power(base, degree);
        setMemory(result);
        return result;
    }

    @Override
    public double power(int base, int degree) {
        double result = calculator.power(base, degree);
        setMemory(result);
        return result;
    }

    @Override
    public double module(double number) {
        double result = calculator.module(number);
        setMemory(result);
        return result;
    }

    @Override
    public double module(int number) {
        double result = calculator.module(number);
        setMemory(result);
        return result;
    }

    @Override
    public double root(double number, int radical) {
        double result = calculator.root(number, radical);
        setMemory(result);
        return result;
    }

    @Override
    public double root(int number, int radical) {
        double result = calculator.root(number, radical);
        setMemory(result);
        return result;
    }
}