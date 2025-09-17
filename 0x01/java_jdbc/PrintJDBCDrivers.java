import java.sql.*;
import java.util.Enumeration;

public class PrintJDBCDrivers {

    public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();

        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.printf("Driver name: %s Version: %s\n",
                    driver.getClass().getName(),
                    driver.getMajorVersion());
        }
    }
}