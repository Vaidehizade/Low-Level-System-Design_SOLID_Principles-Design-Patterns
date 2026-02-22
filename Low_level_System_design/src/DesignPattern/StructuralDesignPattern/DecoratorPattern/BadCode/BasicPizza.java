package StructuralDesignPattern.DecoratorPattern.BadCode;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza basic";
    }

    @Override
    public double getCost() {
        return 100.00; //base cost
    }
}
