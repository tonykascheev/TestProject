package PSB.SQL;

import PSB.Settings.ConfProperties;

import java.sql.*;

public class FindRole {
    public static void main(String[] args) {
        String url = ConfProperties.getProperty("DBURL");
        String username = ConfProperties.getProperty("DBUSER");
        String password = ConfProperties.getProperty("DBPSWRD");
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM APP_ROLE WHERE CODE LIKE '%ЭтаРольСозданаСПомощьюАвтотеста%'");
            while (resultSet.next()) {

                System.out.println(resultSet.getString("CODE"));
                System.out.println(resultSet.getString("ID"));
                Array x = resultSet.getArray("CODE");

            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

