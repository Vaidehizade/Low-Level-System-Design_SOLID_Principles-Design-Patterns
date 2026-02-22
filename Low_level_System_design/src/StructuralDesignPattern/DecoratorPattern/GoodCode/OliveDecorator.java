package StructuralDesignPattern.DecoratorPattern.GoodCode;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription(){
        return decoratePizza.getDescription() + ", Olive";
    }

    public double getCost(){
        return decoratePizza.getCost() + 2.00;
    }
}
