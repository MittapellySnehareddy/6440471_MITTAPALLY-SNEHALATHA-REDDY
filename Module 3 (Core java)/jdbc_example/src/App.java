import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {

    public static void main(String[] args) {
        // JDBC URL for MySQL 8 (timezone added for compatibility)
        String jdbcUrl = "jdbc:mysql://localhost:3306/school?useSSL=false&serverTimezone=UTC";
        String username = "root";           // your MySQL username
        String password = "123456789";   // your MySQL password

        try {
            // 1. Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Connect to database
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // 3. Create statement
            Statement statement = connection.createStatement();

            // 4. Execute SELECT query
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");

            // 5. Print the results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println(id + " | " + name + " | " + age);
            }

            // 6. Close everything
            resultSet.close();
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
