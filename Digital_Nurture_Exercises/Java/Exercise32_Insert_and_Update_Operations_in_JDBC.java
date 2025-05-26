import java.sql.*;

public class StudentDAO {
    private Connection conn;

    public StudentDAO() throws SQLException {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_db", "root", "your_password");
    }

    public void insertStudent(int id, String name) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
        ps.setInt(1, id);
        ps.setString(2, name);
        ps.executeUpdate();
        System.out.println("Student inserted.");
    }

    public void updateStudentName(int id, String newName) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("UPDATE students SET name = ? WHERE id = ?");
        ps.setString(1, newName);
        ps.setInt(2, id);
        ps.executeUpdate();
        System.out.println("Student updated.");
    }

    public static void main(String[] args) throws SQLException {
        StudentDAO dao = new StudentDAO();
        dao.insertStudent(1, "Alice");
        dao.updateStudentName(1, "Alicia");
    }
}
