package StructuralDesignPattern.DecoratorPattern.GoodCode;

import StructuralDesignPattern.DecoratorPattern.GoodCode.Pizza;

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
