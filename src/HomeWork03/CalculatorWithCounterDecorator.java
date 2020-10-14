package HomeWork03;

public class CalculatorWithCounterDecorator extends CalculatorWithCounterInterface {
    private ICalculator innerCalculator;

    public CalculatorWithCounterDecorator(ICalculator calculator){
        this.innerCalculator = calculator;
    }

    public CalculatorWithCounterDecorator(){

    }

    public ICalculator getCalculator(){
        return innerCalculator;
    }

}
