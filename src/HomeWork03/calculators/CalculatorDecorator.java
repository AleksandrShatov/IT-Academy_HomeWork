package HomeWork03.calculators;

import HomeWork03.calculators.CalculatorWithMathExtends;
import HomeWork03.calculators.ICalculator;

public abstract class CalculatorDecorator implements ICalculator {
    private final ICalculator calculator;

    public  CalculatorDecorator(ICalculator calculator){
        this.calculator = calculator;
    }

    public ICalculator getCalculator(){
        return this.calculator;
    }

    //Арифметические методы
    @Override
    public double addition(double add1, double add2) {
        return this.calculator.addition(add1, add2);
    }

    @Override
    public double subtraction(double dec, double sub) {
        return this.calculator.subtraction(dec , sub);
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        return this.calculator.multiplication(mul1, mul2);
    }

    @Override
    public double division(double divisible, double divisor) {
        return this.calculator.division(divisible, divisor);
    }

    @Override
    public double power(double base, int degree) {
        return this.calculator.power(base, degree);
    }

    @Override
    public double module(double number) {
        return this.calculator.module(number);
    }

    @Override
    public double root(double number, int radical) {
        return this.calculator.root(number, radical);
    }

}