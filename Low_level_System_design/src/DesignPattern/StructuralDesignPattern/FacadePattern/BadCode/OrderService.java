package DesignPattern.StructuralDesignPattern.FacadePattern.BadCode;

//Microservice for Order management
public class OrderService {

    public String getOrderDetails(String orderId){
        return "Order details for orderId: "+ orderId;
    }
}
