package HomeWork03;

public class CalculatorWithCounter implements ICalculator {
    private long countOperation = 0L;

    private CalculatorWithOperator calculatorWithOperator;
    private CalculatorWithMathCopy calculatorWithMathCopy;
    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithCounter(CalculatorWithOperator calculatorWithOperator){
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounter(CalculatorWithMathCopy calculatorWithMathCopy){
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounter(CalculatorWithMathExtends calculatorWithMathExtends){
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public CalculatorWithCounter(){
        this(new CalculatorWithOperator());
    }

    private void setCountOperation(){
        this.countOperation++;
    }

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
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.addition(add1, add2);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.addition(add1, add2);
        } else{
            return calculatorWithOperator.addition(add1, add2);
        }
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
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.subtraction(dec, sub);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.subtraction(dec, sub);
        } else{
            return calculatorWithOperator.subtraction(dec, sub);
        }
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
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.multiplication(mul1, mul2);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.multiplication(mul1, mul2);
        } else{
            return calculatorWithOperator.multiplication(mul1, mul2);
        }
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
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.division(divisible, divisor);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.division(divisible, divisor);
        } else{
            return calculatorWithOperator.division(divisible, divisor);
        }
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
    public double power(double base, int degree) {
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.power(base, degree);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.power(base, degree);
        } else{
            return calculatorWithOperator.power(base, degree);
        }
    }

    public double power(int base, int degree){
        return power((double) base, degree);
    }

    /**
     * Метод возвращает модуль входного числа
     * @param number ислодное число
     * @return модуль исходного числа
     */
    public double module(double number){
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.module(number);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.module(number);
        } else{
            return calculatorWithOperator.module(number);
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
    public double root(double number, int radical) {
        setCountOperation();
        if(calculatorWithMathExtends != null){
            return calculatorWithMathExtends.root(number, radical);
        } else if(calculatorWithMathCopy != null){
            return calculatorWithMathCopy.root(number, radical);
        } else{
            return calculatorWithOperator.root(number, radical);
        }
    }

    public double root(int number, int radical){
        return root((double) number, radical);
    }

}
