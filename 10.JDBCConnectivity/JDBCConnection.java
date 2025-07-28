import java.sql.*;

public class JDBCConnection {

    // Database URL, username, and password for MySQL connection
    private static final String url = "jdbc:mysql://localhost:3306/mydb";
    private static final String username = "root";
    private static final String password = "Admin@123";

    public static void main(String[] args) {
        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish a connection to the database
            Connection con = DriverManager.getConnection(url, username, password);

            // 3. Create a Statement object to execute the query
            Statement statement = con.createStatement();

            // 4. Define the SQL query to retrieve data from the 'students' table
            String query = "select * from students";

            // 5. Execute the query and store the result in ResultSet
            ResultSet resultSet = statement.executeQuery(query);

            // 6. Iterate through the ResultSet and print each student's data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");          // Get student ID
                String name = resultSet.getString("name"); // Get student name
                int age = resultSet.getInt("age");        // Get student age
                double marks = resultSet.getDouble("marks"); // Get student marks

                // Print student details
                System.out.print("ID : " + id + " || ");
                System.out.print("NAME : " + name + " || ");
                System.out.print("AGE : " + age + " || ");
                System.out.print("MARKS : " + marks);
                System.out.println(" ");
            }
        } catch (ClassNotFoundException | SQLException e) {
            // Handle exceptions related to driver loading or SQL operations
            System.out.println(e.getMessage());
        }
    }
}
