package in.jayant.designpatterns.adapter;

/**
 * Acts as an adapter which takes the client input and adapt it
 * according to the service the client is trying to use.
 * Takes input in rupee and convert it to dollars before calling service classes
 */
public class PaymentAdapter {

    public void pay(int rupees) {
        PaymentProcessor paymentProcessor = new PaymentProcessorImpl();
        int dollars = convertRupeeToDollar(rupees);
        paymentProcessor.pay(dollars);
    }

    private int convertRupeeToDollar(int rupee) {
        return rupee/64;
    }
}
