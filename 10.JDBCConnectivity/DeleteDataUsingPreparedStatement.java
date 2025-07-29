import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDataUsingPreparedStatement {
    // Database URL, username, and password for MySQL connection
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            // 1. Load the jdbc driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);

            // 3. Create statement
            String query = "DELETE FROM students WHERE ID = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, 2);

            // 4. Execute query
            int rowsAffected = preparedStatement.executeUpdate();

            // 5. Process the result
            if (rowsAffected > 0) {
                System.out.println("Employee with ID 2 deleted successfully");
            } else {
                System.out.println("No employee found with ID 2");
            }

            // Close the connection
            connection.close();
            preparedStatement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
