package hw26.repository.hibernate;

import hw26.entity.Order;
import hw26.repository.OrderRepository;

import java.util.List;

public class OrderRepositoryImpl extends AbstractHibernateRepository<Order> implements OrderRepository {
    protected void init () {
        aClass = Order.class;
    }

    @Override
    public List<Order> getOrdersWithDiscount () {
        List<Order> orders = getAll ( );
        orders.removeIf ( order -> order.getDiscount ( ) == null );
        return orders;
    }
}
