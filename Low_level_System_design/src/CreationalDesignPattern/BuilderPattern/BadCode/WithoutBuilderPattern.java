package CreationalDesignPattern.BuilderPattern.BadCode;

public class WithoutBuilderPattern {
    public static void main(String[] args) {
        House house = new House("Concrete","Wood","shingles", false, true,false);
        //if we have to pass only 3 params and will keep values for others by default
        //we can make or we have to make so many constructors
        //constructor explosion ---> too many constructors
        //difficult to understand and maintain the code
        //this is a builder pattern
        System.out.println(house);

    }
}
