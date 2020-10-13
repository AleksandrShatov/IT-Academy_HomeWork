package HomeWork03;

public interface ICalculator {
    double addition(double add1, double add2);
    double addition(int add1, double add2);
    double addition(double add1, int add2);
    double addition(int add1, int add2);
    double subtraction(double dec, double sub);
    double subtraction(int dec, double sub);
    double subtraction(double dec, int sub);
    double subtraction(int dec, int sub);
    double multiplication(double mul1, double mul2);
    double multiplication(int mul1, double mul2);
    double multiplication(double mul1, int mul2);
    double multiplication(int mul1, int mul2);
    double division(double divisible, double divisor);
    double division(int divisible, double divisor);
    double division(double divisible, int divisor);
    double division(int divisible, int divisor);
    double power(double base, int degree);
    double power(int base, int degree);
    double module(double number);
    double module(int number);
    double root(double number, int radical);
    double root(int number, int radical);
}
