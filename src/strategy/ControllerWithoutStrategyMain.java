package strategy;

public class ControllerWithoutStrategyMain {
    static PaymentService paymentService = new PaymentService();

    public static void main(String[] args) {
        String paymentType = "cash";
        paymentService.processPayment(paymentType);
        paymentType="credit";
        paymentService.processPayment(paymentType);
    }
}
class PaymentService {
    public void processPayment(String payment) {
        if (payment.equals("cash"))
            processCashPayment();
        else if (payment.equals("credit"))
            processCreditCardPayment();
    }
    private void processCreditCardPayment() {
        System.out.println("processing Credit CardPayment");
    }
    public void processCashPayment() {
        System.out.println("processing cashPayment");

    }
}
