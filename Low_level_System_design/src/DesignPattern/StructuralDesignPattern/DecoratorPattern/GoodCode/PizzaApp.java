package StructuralDesignPattern.DecoratorPattern.GoodCode;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();

        //add toppings
        pizza = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
        //advantages
        //flexibility,scalable, SRP , Open close principle, dynamic (toppings can be add at runtime)
        //combinatorial freedom
    }
}
