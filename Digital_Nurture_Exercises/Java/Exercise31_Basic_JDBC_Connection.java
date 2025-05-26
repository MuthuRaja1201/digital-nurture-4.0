import java.sql.*;

public class JdbcConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_db";
        String user = "root";
        String password = "your_password";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
