package HomeWork03;

public class CalculatorWithCounter {
    private long countOperation = 0;

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
        if(divisor == 0.0){
            return 0.0;
        };
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




}
