package HomeWork03;

public class CalculatorWithMemoryDecorator extends CalculatorWithMemory {
    private ICalculator innerCalculator;

    public CalculatorWithMemoryDecorator(ICalculator calculator){
        this.innerCalculator = calculator;
    }

    public CalculatorWithMemoryDecorator(){

    }

    public ICalculator getCalculator(){
        return innerCalculator;
    }

}
