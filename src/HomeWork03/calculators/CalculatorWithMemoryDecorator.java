package HomeWork03.calculators;

public class CalculatorWithMemoryDecorator extends CalculatorDecorator {
    /**
     * Память - результат последней операции
     */
    private double memory = 0.0;

    public  CalculatorWithMemoryDecorator(ICalculator calculator){
        super(calculator);
    }

    /**
     * Метод записывающий значение результата в память (поле класса memory)
     * @param value значение, которое будет помещено в память
     */
    private void setMemory(double value){
        this.memory = value;
    }

    /**
     * Метод достающий значение из памяти и приэтом очищающий память в 0.
     * @return возвращает значение из памяти
     */
    public double getMemory(){
        double tmpMem = this.memory;
        this.memory = 0.0;
        return tmpMem;
    }

    //Арифметические методы
    @Override
    public double addition(double add1, double add2) {
        double result = super.addition(add1, add2);
        setMemory(result);
        return result;
    }

    @Override
    public double subtraction(double dec, double sub) {
        double result = super.subtraction(dec, sub);
        setMemory(result);
        return result;
    }

    @Override
    public double multiplication(double mul1, double mul2) {
        double result = super.multiplication(mul1, mul2);
        setMemory(result);
        return result;
    }

    @Override
    public double division(double divisible, double divisor) {
        double result = super.division(divisible, divisor);
        setMemory(result);
        return result;
    }

    @Override
    public double power(double base, int degree) {
        double result = super.power(base, degree);
        setMemory(result);
        return result;
    }

    @Override
    public double module(double number) {
        double result = super.module(number);
        setMemory(result);
        return result;
    }

    @Override
    public double root(double number, int radical) {
        double result = super.root(number, radical);
        setMemory(result);
        return result;
    }

}
