package DesignPattern.StructuralDesignPattern.FacadePattern.BadCode;

public class Client {
    public static void main(String[] args) {
        //Client code interacting with different services directly
        UserService userService = new UserService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
    //we have exposed everything to client here directly
        //Tight coupling
        //complexity
        //Task
        System.out.println(userService.getUserDetails("123"));
        System.out.println(orderService.getOrderDetails("456"));
        System.out.println(paymentService.processPayment("700"));
    }
}
