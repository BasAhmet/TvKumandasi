import java.sql.*;

public class Kanallar {
    public static String kanallar[] = {"TRT", "ATV", "AHABER", "TV8", "FOX", "SHOW"};

    public static void kanalBilgileri() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres"
                ,DatabaseNamePassword.getUserName()
                ,DatabaseNamePassword.getPassword());
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM kanal_bilgileri";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1) + " --> "
                    +resultSet.getString(2) + " --> "
                    +resultSet.getString(3) + " --> "
                    +resultSet.getString(4) + " --> "
                    +resultSet.getString(5) + " --> "
                    +resultSet.getString(6) + " --> "
                    +resultSet.getString(7));
        }
        connection.close();
        statement.close();



    }

}
