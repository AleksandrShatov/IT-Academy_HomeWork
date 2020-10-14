package HomeWork03;

public class CalculatorWithOperator implements ICalculator {

    /**
     * Метод для вычисления суммы двух чисел
     * @param add1 первое слагаемое
     * @param add2 второе слагаемое
     * @return сумма
     */
    public double addition(double add1, double add2){
        return add1 + add2;
    }

    public double addition(int add1, double add2){
        return addition((double) add1, add2);
    }

    public double addition(double add1, int add2){
        return addition(add1, (double) add2);
    }

    public double addition(int add1, int add2){
        return addition((double) add1, (double) add2);
    }

    /**
     * Метод для вычесления разности двух чисел
     * @param dec уменьшаемое
     * @param sub вычитаемое
     * @return разность
     */
    public double subtraction(double dec, double sub){
        return dec - sub;
    }

    public double subtraction(int dec, double sub){
        return subtraction((double) dec, sub);
    }

    public double subtraction(double dec, int sub){
        return subtraction(dec, (double) sub);
    }

    public double subtraction(int dec, int sub){
        return subtraction((double) dec, (double) sub);
    }

    /**
     * Метод для вычесления произведения двух чисел
     * @param mul1 первый множитель
     * @param mul2 второй множитель
     * @return произведение
     */
    public double multiplication(double mul1, double mul2){
        return mul1 * mul2;
    }

    public double multiplication(int mul1, double mul2){
        return multiplication((double) mul1, mul2);
    }

    public double multiplication(double mul1, int mul2){
        return multiplication(mul1, (double) mul2);
    }

    public double multiplication(int mul1, int mul2){
        return multiplication((double) mul1, (double) mul2);
    }

    /**
     * Метод для вычисления частного двух чисел
     * @param divisible делимое
     * @param divisor делитель
     * @return частное
     */
    public double division(double divisible, double divisor){
        if(divisor == 0.0){
            return 0.0; // Не правильно, но как заглушка от деления на 0!
        };
        return divisible / divisor;
    }

    public double division(int divisible, double divisor){
        return division((double) divisible, divisor);
    }

    public double division(double divisible, int divisor){
        return division(divisible, (double) divisor);
    }

    public double division(int divisible, int divisor){
        return division((double) divisible, (double) divisor);
    }

    /**
     * Методя для возведения числа в целую степень
     * @param base основание (число, которое возводим в степень)
     * @param degree степень
     * @return основание возведённое в степень
     */
    public double power(double base, int degree){
        if(base == 0.0){
            return 0.0;
        }
        double result = 1.0;
        if(degree == 0) {
            result = 1.0;
        } else if(degree > 0) {
            for (int i= 0; i < degree; i++) {
                result *= base;
            }
        } else {
            for (int i = 0; i > degree; i--) {
                result /= base;
            }
        }
        return result;
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
        if(number >= 0){
            return number;
        } else {
            return -number;
        }
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
