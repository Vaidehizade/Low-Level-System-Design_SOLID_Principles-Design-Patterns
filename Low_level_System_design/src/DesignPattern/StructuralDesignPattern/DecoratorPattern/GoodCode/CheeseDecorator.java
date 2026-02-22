package StructuralDesignPattern.DecoratorPattern.GoodCode;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    public String getDescription(){
        return decoratePizza.getDescription() + ", Cheese";
    }

    public double getCost(){
        return decoratePizza.getCost() + 1.00;
    }
}
