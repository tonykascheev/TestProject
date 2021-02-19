package PSB.SQL;

import java.sql.*;

public class DeleteRole {
    public static void main(String[] args) {
        String url="jdbc:postgresql://192.168.88.54:5432/elib";
        String username="elib_user";
        String password="elib_user";
        try {
            Class.forName("org.postgresql.Driver");
            Connection connection= DriverManager.getConnection(url, username, password);
            Statement statement=connection.createStatement();
            statement.executeQuery("DELETE FROM APP_ROLE_AUTHORITY WHERE ROLE_ID IN (112,113)");
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

