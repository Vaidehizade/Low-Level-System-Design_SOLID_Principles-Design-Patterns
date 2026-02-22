package StructuralDesignPattern.DecoratorPattern.GoodCode;

abstract class PizzaDecorator implements Pizza{

    protected Pizza decoratePizza;

    public PizzaDecorator(Pizza pizza){
        this.decoratePizza = pizza;
    }
    @Override
    public String getDescription() {
        return decoratePizza.getDescription();
    }

    @Override
    public double getCost() {
        return decoratePizza.getCost();
    }
}
