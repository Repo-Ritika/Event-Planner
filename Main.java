//  Will Compile with: javac -cp .;lib\mysql-connector-j-8.0.33.jar Main.java
//  And Run with: java -cp .;lib\mysql-connector-j-8.0.33.jar Main
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/event_planner";
        String username = "root";
        String password = "ritika17x22"; 

        try {
            // Loading the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Connecting to the database
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database!");

            // Query the events table
            String query = "SELECT * FROM events";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Display the results
            System.out.println("📅 Events:");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("event_id") +
                                   ", Title: " + rs.getString("title") +
                                   ", Date: " + rs.getDate("event_date") +
                                   ", Location: " + rs.getString("location"));
            }

            
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
