package HomeWork03;

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

    public double power(int base, int degree) {
        return power((double) base, degree);
    }

    /**
     * Метод возвращает модуль входного числа
     * @param number ислодное число
     * @return модуль исходного числа
     */
    public double module(double number){
        return Math.abs(number);
    }

    public double module(int number){
        return module((double) number);
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

    public double root(int number, int radical){
        return root((double) number, radical);
    }
}
