import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public Connection connect(String connectionUrl) {
        try {
            Connection connection = DriverManager.getConnection(connectionUrl);
            return connection;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    @Override
    public void createTable(String connectionUrl) {
        Connection connection = null;

        try {
            connection = connect(connectionUrl);
            Statement statement = connection.createStatement();

            String createTableSql = "CREATE TABLE Customer (\n" +
                "id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "name VARCHAR(100) NOT NULL,\n" +
                "age INT,\n" +
                "cpf VARCHAR(20) UNIQUE,\n" +
                "rg VARCHAR(20) UNIQUE\n" +
                ");";

            statement.execute(createTableSql);
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void insert(String connectionUrl, Customer customer) {
        Connection connection = null;

        try {
            connection = connect(connectionUrl);
            Statement statement = connection.createStatement();

            String insertSql = "INSERT INTO Customer (name, age, cpf, rg)\n" +
                String.format("VALUES ('%s', %d, '%s', '%s');",
                    customer.getName(),
                    customer.getAge(),
                    customer.getCpf(),
                    customer.getRg()
                );

                statement.execute(insertSql);
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void selectAll(String connectionUrl) {
        Connection connection = null;

        try {
            connection = connect(connectionUrl);
            Statement statement = connection.createStatement();

            String selectSql = "SELECT * FROM Customer;";

            ResultSet resultSet = statement.executeQuery(selectSql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void update(String connectionUrl, int id, String name, Integer age) {
        Connection connection = null;

        try {
            connection = connect(connectionUrl);
            Statement statement = connection.createStatement();

            String updateSql = String.format("UPDATE Customer\n" +
                "SET age = %d,\n" +
                "name = '%s'\n" +
                "WHERE id = %d;", age, name, id);

            statement.execute(updateSql);
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
    }

    @Override
    public void delete(String connectionUrl, int id) {
        Connection connection = null;

        try {
            connection = connect(connectionUrl);
            Statement statement = connection.createStatement();

            String deleteSql = "DELETE FROM Customer\n" +
                "WHERE id = 1;";
            
            statement.execute(deleteSql);
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println(e);
                }
            }
        }
    }

    
}