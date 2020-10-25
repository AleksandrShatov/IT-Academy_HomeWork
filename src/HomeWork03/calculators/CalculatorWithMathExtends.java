package HomeWork03.calculators;

import HomeWork03.calculators.CalculatorWithOperator;
import HomeWork03.calculators.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /**
     * Методя для возведения числа в целую степень
     * @param base основание (число, которое возводим в степень)
     * @param degree степень
     * @return основание возведённое в степень
     */
    public double power(double base, int degree){
        return Math.pow(base, (double) degree);
    }

    /**
     * Метод возвращает модуль входного числа
     * @param number ислодное число
     * @return модуль исходного числа
     */
    public double module(double number){
        return Math.abs(number);
    }

    /**
     * Методя для вычисления корня заданной степени
     * @param number число, корень которого нужно найти
     * @param radical степень корня
     * @return корень исходного числа
     */
    public double root(double number, int radical){
        return Math.pow(number, (double) radical);
    }

}
