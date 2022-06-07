package in.jayant.designpatterns.adapter;

/**
 * Client class which uses PaymentProcessor. Since Payment processor accepts dollar amount, It uses PaymentAdapter
 */
public class PaymentApp {
    public void pay(int rupees) {
        PaymentAdapter paymentAdapter = new PaymentAdapter();
        paymentAdapter.pay(rupees);
    }

    public static void main(String[] args) {
        PaymentApp paymentApp = new PaymentApp();
        paymentApp.pay(400);
        paymentApp.pay(1000);
    }
}
