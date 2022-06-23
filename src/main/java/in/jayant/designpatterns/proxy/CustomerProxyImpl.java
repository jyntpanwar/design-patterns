package in.jayant.designpatterns.proxy;

import java.util.ArrayList;
import java.util.List;

public class CustomerProxyImpl implements Customer{

    private CustomerImpl customer = new CustomerImpl();

    @Override
    public int getId() {
        return customer.getId();
    }

    @Override
    public List<Order> getOrders() {
        List<Order> orders = new ArrayList<>();
        Order order = new Order();
        order.setId(1);
        order.setProductName("Mac");
        order.setQuantity(100);
        orders.add(order);

        Order order2 = new Order();
        order2.setId(2);
        order2.setProductName("IPhone");
        order2.setQuantity(1000);
        orders.add(order2);
        return orders;
    }
}
