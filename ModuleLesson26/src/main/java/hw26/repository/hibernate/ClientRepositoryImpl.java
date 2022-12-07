package hw26.repository.hibernate;

import hw26.entity.Client;
import hw26.entity.Order;
import hw26.repository.ClientRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ClientRepositoryImpl extends AbstractHibernateRepository<Client> implements ClientRepository {
    protected void init () {
        aClass = Client.class;
    }

    private static final OrderRepositoryImpl orderRepository = new OrderRepositoryImpl ( );

    @Override
    public List<Client> getClientsWithAmountOfOrdersGreater ( int amount ) {
        List<Client> clients = getAll ( );
        List<Order> orders = orderRepository.getAll ( );
        List<Order> clientsOrder = new ArrayList<> ( );
        List<Client> clientList = new ArrayList<> ( );

        for (Client value : clients) {
            for (Order item : orders) {
                if (Objects.equals ( value.getId ( ) , item.getClient ( ).getId ( ) )) {
                    clientsOrder.add ( item );
                    if (clientsOrder.size ( ) > amount) {
                        clientList.add ( value );
                    }
                }
            }
        }
        return clientList;
    }

    @Override
    public int removeAllClientsYoungerThan ( int age ) {
        List<Client> clients = getAll ( );
        clients.removeIf ( client -> ( LocalDate.now ( ).getYear ( ) - client.getDateOfBirth ( ).getYear ( ) ) < age );
        return clients.size ( );
    }

    @Override
    public List<Client> getClientsWithSumOfOrdersGreaterAndAmountOfGoodsInOrderGreater ( int amountOfOrders , int goodsLimit ) {
        List<Client> clients = getAll ( );
        List<Order> orders = orderRepository.getAll ( );
        List<Client> clientList = new ArrayList<> ( );
        List<Order> orderList = new ArrayList<> ( );
        int orderSum = 0;
        int goodsNumber = 0;

        for (Client client : clients) {
            for (Order order : orders) {
                if (Objects.equals ( client.getId ( ) , order.getClient ( ).getId ( ) )) {
                    orderList.add ( order );
                }
                orderSum = orderList.stream ( )
                        .mapToInt ( x -> x.getTotalPrice ( ).intValue ( ) ).sum ( );
                goodsNumber = order.getGoods ( ).size ( );

                if (orderSum > amountOfOrders && goodsNumber > goodsLimit) {
                    clientList.add ( client );
                }
            }
        }
        return clientList;
    }
}
