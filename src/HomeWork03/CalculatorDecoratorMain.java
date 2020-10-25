package HomeWork03;

import HomeWork03.calculators.CalculatorWithCounterDecorator;
import HomeWork03.calculators.CalculatorWithMathExtends;
import HomeWork03.calculators.CalculatorWithMemoryDecorator;
import HomeWork03.calculators.ICalculator;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {

        ICalculator mainCalculator = new CalculatorWithCounterDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        System.out.println("Результат вычисления с помощью калькулятора декоратора: ");

        print(mainCalculator);

    }

    public static void print(ICalculator calculator){
        calculator.division(28, 5);
        if(calculator instanceof CalculatorWithCounterDecorator){
            CalculatorWithCounterDecorator counterDecorator = (CalculatorWithCounterDecorator) calculator;
            if(counterDecorator.getCalculator() instanceof CalculatorWithMemoryDecorator){
                CalculatorWithMemoryDecorator memoryDecorator = (CalculatorWithMemoryDecorator) counterDecorator.getCalculator();
                calculator.power(memoryDecorator.getMemory(), 2);
                calculator.addition(4.1, memoryDecorator.getMemory());
                calculator.addition(memoryDecorator.getMemory(), calculator.multiplication(15, 7));
                System.out.println("4,1 + 15 * 7 + (28 / 5) ^ 2 = " + memoryDecorator.getMemory());
            }
            System.out.println("Количество использований калькулятора = " + counterDecorator.getCountOperation());
        }
    }

}
