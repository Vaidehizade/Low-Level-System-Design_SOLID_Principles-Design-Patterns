package DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode;



public class Client {
    public static void main(String[] args) {
         ApiGateway api1 = new ApiGateway();  //CENTRALIZED SERVICE
        //SIMPLIFIED
        //DECOUPLING
        //CONSISTENT
        System.out.println(api1.getFullOrderDetails("1234", "order-01", "700"));
    }
}
