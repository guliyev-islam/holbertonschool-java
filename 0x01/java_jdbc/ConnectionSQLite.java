import java.sql.*;

public class ConnectionSQLite {

    public static void main(String[] args) {
        initConnection();
    }

    private static void initConnection() {

        String url = "jdbc:sqlite:./sqlite_database_2022.db";

        // try (Connection connection = DriverManager.getConnection(url)) {

        // } catch (SQLException e) {}

        try {
            Connection connection = DriverManager.getConnection(url);
            connection.close();
        } catch (SQLException e) {}
    }
}