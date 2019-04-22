package bd.ac.seu.collectios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    private static JdbcConnection instance = new JdbcConnection();
    private static Connection connection;

    private JdbcConnection() {
        connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            //System.out.println("Conenect to the Database throw driver");
            final String DBURL = "jdbc:mysql://192.1.1.100/emrandb";
            final String USERNAME = "ibnshayed";
            final String PASSWORD = "420420";

            connection = DriverManager.getConnection(DBURL, USERNAME, PASSWORD);
            //System.out.println("Connection Successful");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }


}
