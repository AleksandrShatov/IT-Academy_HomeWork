package HomeWork03.calculators;

public class CalculatorWithCounter implements ICalculator {
    /**
     * количество использований калькулятора
     */
    private long countOperation = 0L;

    private final CalculatorWithOperator calculatorWithOperator;
    private final CalculatorWithMathCopy calculatorWithMathCopy;
    private final CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
        this.calculatorWithMathCopy = null;
        this.calculatorWithMathExtends = null;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculatorWithMathCopy){
        this.calculatorWithOperator = null;
        this.calculatorWithMathCopy = calculatorWithMathCopy;
        this.calculatorWithMathExtends = null;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculatorWithMathExtends){
        this.calculatorWithOperator = null;
        this.calculatorWithMathCopy = null;
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    /**
     * Метод, инкрементирующий количество использования калькулятора на 1.
     * Вызывается при выполнении любой из операций.
     */
    private void incrementCountOperation(){
        this.countOperation++;
    }

    /**
     * Метод для получения количество использований калькулятора
     * @return значение - сколько раз использовался калькулятор
     */
    public long getCountOperation(){
        return countOperation;
    }

    /**
     * Метод для вычисления суммы двух чисел
     * @param add1 первое слагаемое
     * @param add2 второе слагаемое
     * @return сумма
     */
    public double addition(double add1, double add2){
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.addition(add1, add2);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.addition(add1, add2);
        } else{
            return this.calculatorWithOperator.addition(add1, add2);
        }
    }

    /**
     * Метод для вычесления разности двух чисел
     * @param dec уменьшаемое
     * @param sub вычитаемое
     * @return разность
     */
    public double subtraction(double dec, double sub){
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.subtraction(dec, sub);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.subtraction(dec, sub);
        } else{
            return this.calculatorWithOperator.subtraction(dec, sub);
        }
    }

    /**
     * Метод для вычесления произведения двух чисел
     * @param mul1 первый множитель
     * @param mul2 второй множитель
     * @return произведение
     */
    public double multiplication(double mul1, double mul2){
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.multiplication(mul1, mul2);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.multiplication(mul1, mul2);
        } else{
            return this.calculatorWithOperator.multiplication(mul1, mul2);
        }
    }

    /**
     * Метод для вычисления частного двух чисел
     * @param divisible делимое
     * @param divisor делитель
     * @return частное
     */
    public double division(double divisible, double divisor){
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.division(divisible, divisor);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.division(divisible, divisor);
        } else{
            return this.calculatorWithOperator.division(divisible, divisor);
        }
    }

    /**
     * Методя для возведения числа в целую степень
     * @param base основание (число, которое возводим в степень)
     * @param degree степень
     * @return основание возведённое в степень
     */
    public double power(double base, int degree) {
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.power(base, degree);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.power(base, degree);
        } else{
            return this.calculatorWithOperator.power(base, degree);
        }
    }

    /**
     * Метод возвращает модуль входного числа
     * @param number ислодное число
     * @return модуль исходного числа
     */
    public double module(double number){
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.module(number);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.module(number);
        } else{
            return this.calculatorWithOperator.module(number);
        }
    }

    /**
     * Методя для вычисления корня заданной степени
     * @param number число, корень которого нужно найти
     * @param radical степень корня
     * @return корень исходного числа
     */
    public double root(double number, int radical) {
        incrementCountOperation();
        if(this.calculatorWithMathExtends != null){
            return this.calculatorWithMathExtends.root(number, radical);
        } else if(this.calculatorWithMathCopy != null){
            return this.calculatorWithMathCopy.root(number, radical);
        } else{
            return this.calculatorWithOperator.root(number, radical);
        }
    }

}
