package math.problems;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connection {

    Connection con = null;

    public static Connection connectDB() {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(

                    "jdbc:mysql://localhost:3306/hotelman",

                    "root", "1234");


            return con;

        } catch (SQLException e) {

            System.out.println(e);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return null;
    }
}
