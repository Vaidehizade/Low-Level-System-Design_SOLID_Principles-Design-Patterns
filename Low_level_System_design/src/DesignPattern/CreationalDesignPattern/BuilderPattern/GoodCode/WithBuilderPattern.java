package CreationalDesignPattern.BuilderPattern.GoodCode;

public class WithBuilderPattern {
    public static void main(String[] args) {
        //giving method name instead parameter name
        //chaining
        //you can change them in any order
        //all methods should return houseBuilder
        //and build method  should return a house
        //will not directly call the house constructor
        House house = new House.HouseBuilder("Concrete","Wooden","Tile")
//                .setGarden(true)
//                .setSwimmingPool(true)
//                .setGarage(false)
                .build();
        System.out.println(house);
    }
}
