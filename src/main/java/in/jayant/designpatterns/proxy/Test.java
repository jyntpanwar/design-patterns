package in.jayant.designpatterns.proxy;

// The main idea here is to communicate with an object via a proxy object.
// The Proxy Object in turn communicate with the original object.
// The benefit here is the proxy object can help with lazy initializations as used in ORM frameworks
// like Hibernate which creates proxy classes on the go in memory to achieve lazy initialization.

// Here we are getting the orders via a proxy object.

public class Test {

    public static void main(String[] args) {
        Customer customer = new CustomerImpl();
        System.out.println(customer.getId());
        System.out.println(customer.getOrders());

        System.out.println("=========================");

        Customer customerProxy = new CustomerProxyImpl();
        System.out.println(customerProxy.getId());
        System.out.println(customerProxy.getOrders());
    }
}
