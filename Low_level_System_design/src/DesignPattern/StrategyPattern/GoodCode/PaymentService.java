package DesignPattern.StrategyPattern.GoodCode;

class PaymentService{
    private Strategy st;
    public void setPaymentService(Strategy st){
        this.st = st;
    }
    public void pay() {
        st.processPayment(); //Polymorphic behaviour
    }
}
