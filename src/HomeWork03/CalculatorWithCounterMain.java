package HomeWork03;

public class CalculatorWithCounterMain {
    public static void main(String[] args) {
        CalculatorWithCounter calc = new CalculatorWithCounter(new CalculatorWithMathCopy());
        double result = 0.0;
        result = calc.division(28, 5);
        result = calc.power(result, 2);
        result = calc.addition(4.1, result);
        result = calc.addition(calc.multiplication(15, 7), result);

        System.out.println("Результат вычисления с помощью калькулятора CalculatorWithMathCopy: ");
        System.out.println("4,1 + 15 * 7 + (28 / 5) ^ 2 = " + result);
        System.out.println("Количество использований калькулятора = " + calc.getCountOperation());
    }
}
