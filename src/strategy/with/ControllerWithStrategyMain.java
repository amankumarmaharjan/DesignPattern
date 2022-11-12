package strategy.with;


public class ControllerWithStrategyMain {
    static PaymentServiceClass paymentService = new PaymentServiceClass();

    public static void main(String[] args) {

        paymentService.setPaymentStrategy(new CashPayment());
        paymentService.validate();
        paymentService.processPayment();

        paymentService.setPaymentStrategy(new CardPayment());
        paymentService.processPayment();

        paymentService.setPaymentStrategy(new PaypalPayment());
        paymentService.processPayment();

    }
}

class PaymentServiceClass {
    IPayment paymentStrategy;

    public void setPaymentStrategy(IPayment payment) {
        this.paymentStrategy = payment;
    }

    public void processPayment() {
        paymentStrategy.processPayment();
    }

    public void validate() {
        paymentStrategy.validateAccount();
    }
}

abstract class IPayment {
    abstract void processPayment();

    void validateAccount() {
        System.out.println("checking accountDetails");
    }
}

class CashPayment extends IPayment {
    @Override
    public void processPayment() {
        System.out.println("processing Cash Payment");
    }
}

class CardPayment extends IPayment {
    @Override
    public void processPayment() {
        System.out.println("processing  Card Payment");
    }
}

class PaypalPayment extends IPayment {
    @Override
    public void processPayment() {
        System.out.println("processing  Paypal Payment");
    }
}

