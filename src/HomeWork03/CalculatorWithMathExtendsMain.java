package HomeWork03;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calc = new CalculatorWithMathExtends();
        double result = 0.0;
        result = calc.division(28, 5);
        result = calc.power(result, 2);
        result = calc.addition(4.1, result);
        result = calc.addition(calc.multiplication(15, 7), result);

        System.out.println("Результат вычисления с помощью калькулятора CalculatorWithMathExtends: ");
        System.out.println("4,1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
    }
}
