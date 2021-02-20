package PSB.SQL;

import PSB.Settings.ConfProperties;

import java.sql.*;

public class DeleteRole {
    public static void main(String[] args) {
        String url = ConfProperties.getProperty("DBURL");
        String username = ConfProperties.getProperty("DBUSER");
        String password = ConfProperties.getProperty("DBPSWRD");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            statement.executeQuery("DELETE FROM APP_ROLE_AUTHORITY WHERE ROLE_ID = 121");
            statement.executeQuery("DELETE FROM APP_ROLE WHERE CODE LIKE '%ЭтаРольСозданаСПомощьюАвтотеста%'");
            statement.close();

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

