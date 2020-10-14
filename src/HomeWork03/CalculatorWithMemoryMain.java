package HomeWork03;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends calcWithMath = new CalculatorWithMathExtends();
        CalculatorWithMemory calc = new CalculatorWithMemory(calcWithMath);

        calc.division(28, 5);
        calc.power(calc.getMemory(), 2);
        calc.addition(4.1, calc.getMemory());
        calc.addition(calc.getMemory(), calc.multiplication(15, 7));

        System.out.println("Результат вычисления с помощью калькулятора CalculatorWithMemory: ");
        System.out.println("4,1 + 15 * 7 + (28 / 5) ^ 2 = " + calc.getMemory());
    }
}
