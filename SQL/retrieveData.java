package SQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieveData {
    public static void main(String[] args) {
        // Database connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase"; // Replace "mydatabase" with your database name
        String username = "your_username"; // Replace "your_username" with your MySQL username
        String password = "your_password"; // Replace "your_password" with your MySQL password

        // SQL query to retrieve data
        String query = "SELECT * FROM my_table"; // Replace "my_table" with your table name

        try {
            // Establishing connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);
            
            // Creating statement object
            Statement statement = connection.createStatement();
            
            // Executing the query and retrieving the result set
            ResultSet resultSet = statement.executeQuery(query);
            
            // Iterating through the result set and printing data
            while (resultSet.next()) {
                // Retrieve data from the result set
                int id = resultSet.getInt("id"); // Replace "id" with your column name
                String name = resultSet.getString("name"); // Replace "name" with your column name
                // Print retrieved data
                System.out.println("ID: " + id + ", Name: " + name);
                // Add more columns as needed
            }
            
            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
