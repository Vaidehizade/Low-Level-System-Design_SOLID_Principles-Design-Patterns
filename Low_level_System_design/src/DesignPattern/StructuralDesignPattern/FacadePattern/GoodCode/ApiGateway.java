package DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode;

import DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode.OrderService;
import DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode.PaymentService;
import DesignPattern.StructuralDesignPattern.FacadePattern.GoodCode.UserService;

public class ApiGateway {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public ApiGateway(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    public String getFullOrderDetails(String userId, String orderId, String paymentId){
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentProcessing = paymentService.processPayment(paymentId);
        return userDetails + " " + orderDetails + " " + paymentProcessing;
    }

}
