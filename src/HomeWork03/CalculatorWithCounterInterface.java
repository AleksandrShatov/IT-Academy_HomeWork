package HomeWork03;

public class CalculatorWithCounterInterface implements ICalculator {
    private long countOperation = 0;

    private ICalculator calculator;

    public CalculatorWithCounterInterface(ICalculator calculator){
        this.calculator = calculator;
    }

    public CalculatorWithCounterInterface(){
        this(new CalculatorWithOperator());
    }

    private void setCountOperation(){
        this.countOperation++;
    }

    public long getCountOperation(){
        return countOperation;
    }

}
