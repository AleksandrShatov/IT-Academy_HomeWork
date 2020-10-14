package HomeWork03;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        CalculatorWithCounterDecorator mainCalculator = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        mainCalculator.division(28, 5);
        mainCalculator.power(mainCalculator.getCalculator().getMemory(), 2);
        mainCalculator.addition(4.1, mainCalculator.getMemory());
        mainCalculator.addition(mainCalculator.getMemory(), mainCalculator.multiplication(15, 7));

        System.out.println("Результат вычисления с помощью калькулятора декоратора: ");
        System.out.println("4,1 + 15 * 7 + (28 / 5) ^ 2 = " + mainCalculator.getMemory());
        System.out.println("Количество использований калькулятора = " + mainCalculator.getCountOperation());

    }
}
