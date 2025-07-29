import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDataUsingPreparedStatement {
    // Database URL, username, and password for MySQL connection
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // 3. Prepare a statement object to execute the query
            String query = "UPDATE students SET marks = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setDouble(1, 74.98);
            preparedStatement.setInt(2, 3);

            // 4. Execute the query and update tha data into the database
            int rowAffected = preparedStatement.executeUpdate();
            if (rowAffected > 0) {
                System.out.println("Data updated successfully!");
            } else {
                System.out.println("Data not updated!");
            }

            // 5. Close the resources
            connection.close();
            preparedStatement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
