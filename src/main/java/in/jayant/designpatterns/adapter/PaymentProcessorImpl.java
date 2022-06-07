package in.jayant.designpatterns.adapter;

/**
 * Actual Payment Processor implementation
 */
public class PaymentProcessorImpl implements PaymentProcessor {
    @Override
    public void pay(int dollars) {
        System.out.println("Paying amount : " + dollars + " dollars !");
    }
}
