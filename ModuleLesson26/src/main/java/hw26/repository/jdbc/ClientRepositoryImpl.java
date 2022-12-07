package hw26.repository.jdbc;

import hw26.entity.Client;
import hw26.repository.ClientRepository;
import lombok.SneakyThrows;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl extends AbstractJDBCRepository implements ClientRepository {
    private final String createUserSQL = "INSERT INTO clients (client_id, first_name, last_name, date_of_birth) VALUES (?,?,?,?)";
    private final String selectAllClientsSQL = "SELECT * FROM clients";
    private final String selectClientByIdSQL = "SELECT * FROM clients WHERE client_id = ?";

    private final String getClientsWithSumOfOrdersGreaterAndAmountOfGoodsInOrderGreater = "";


    @SneakyThrows
    @Override
    public Client getById ( String id ) {
        try (Connection connection = createConnection ( );
             PreparedStatement statement = connection.prepareStatement ( selectClientByIdSQL )) {
            statement.setString ( 1 , id );
            try (ResultSet resultSet = statement.executeQuery ( )) {
                if (resultSet.next ( )) {
                    return extractClientFromResultSet ( resultSet );
                }
                return null;
            }
        }
    }

    @SneakyThrows
    @Override
    public List<Client> getAll () {
        List<Client> clients = new ArrayList<> ( );
        try (Connection connection = createConnection ( );
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( selectAllClientsSQL )) {
            while ( resultSet.next ( ) ) {
                clients.add ( extractClientFromResultSet ( resultSet ) );
            }
            return clients;
        }
    }

    @SneakyThrows
    @Override
    public void save ( Client client ) {
        try (Connection connection = createConnection ( );
             PreparedStatement statement = connection.prepareStatement ( createUserSQL )) {
            statement.setString ( 1 , client.getId ( ) );
            statement.setString ( 2 , client.getFirstName ( ) );
            statement.setString ( 3 , client.getLastName ( ) );
            statement.setDate ( 4 , Date.valueOf ( client.getDateOfBirth ( ) ) );
            statement.execute ( );
        }
    }

    private Client extractClientFromResultSet ( ResultSet resultSet ) throws SQLException {
        Client client = new Client ( );
        client.setId ( resultSet.getString ( "client_id" ) );
        client.setFirstName ( resultSet.getString ( "first_name" ) );
        client.setLastName ( resultSet.getString ( "last_name" ) );
        client.setDateOfBirth ( resultSet.getDate ( "date_of_birth" ).toLocalDate ( ) );
        return client;
    }

    @SneakyThrows
    @Override
    public List<Client> getClientsWithAmountOfOrdersGreater ( int amount ) {
        String temp = "SELECT  *, COUNT(orders.client_id = clients.client_id)" +
                " FROM clients RIGHT JOIN orders ON clients.client_id = orders.client_id" +
                " GROUP BY clients.client_id";
        List<Client> clients = new ArrayList<> ( );

        try (Connection connection = createConnection ( );
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( temp )) {

            while ( resultSet.next ( ) ) {
                String s = resultSet.getString ( "count(orders.client_id = clients.client_id)" );
                if (Integer.parseInt ( s ) > amount) {
                    clients.add ( extractClientFromResultSet ( resultSet ) );
                }
            }
            return clients;
        }
    }

    @Override
    public int removeAllClientsYoungerThan ( int age ) {
        List<Client> clients = getAll ( );
        clients.removeIf ( client -> ( LocalDate.now ( ).getYear ( ) - client.getDateOfBirth ( ).getYear ( ) ) < age );
        return clients.size ( );
    }

    @SneakyThrows
    @Override
    public List<Client> getClientsWithSumOfOrdersGreaterAndAmountOfGoodsInOrderGreater ( int amountOfOrders , int goodsLimit ) {
        String temp = "SELECT *, SUM(total_price)," +
                " COUNT (goods_id) " +
                " FROM clients " +
                " RIGHT JOIN orders ON clients.client_id = orders.client_id" +
                " RIGHT JOIN orders_goods ON orders.order_id  = orders_goods.order_id" +
                " GROUP BY clients.client_id";

        List<Client> clients = new ArrayList<> ( );
        amountOfOrders = (int) Long.parseLong ( String.valueOf ( amountOfOrders ) );

        try (Connection connection = createConnection ( );
             Statement statement = connection.createStatement ( );
             ResultSet resultSet = statement.executeQuery ( temp )) {
            while ( resultSet.next ( ) ) {
                long s = resultSet.getLong ( "sum(total_price)" );
                String t = resultSet.getString ( "count (goods_id)" );

                if (( s ) > amountOfOrders && Integer.parseInt ( t ) > goodsLimit) {
                    clients.add ( extractClientFromResultSet ( resultSet ) );
                }
            }
            return clients;
        }
    }
}