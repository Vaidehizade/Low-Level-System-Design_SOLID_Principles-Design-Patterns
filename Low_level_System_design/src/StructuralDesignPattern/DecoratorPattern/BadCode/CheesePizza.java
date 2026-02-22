package StructuralDesignPattern.DecoratorPattern.BadCode;

public class CheesePizza extends BasicPizza {
    @Override
    public String getDescription() {
        return  super.getDescription() + ", Cheese pizza";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.00;
    }
}
