import java.sql.*;
public class DataInsAndUpd {
  private final String dbUrl = "jdbc:mysql://localhost:3306/school";
  private final String dbUser = "root";
  private final String dbPass = "manoj0512";
  private Connection connect() throws SQLException {
    return DriverManager.getConnection(dbUrl, dbUser, dbPass);
  }
  public void addStudent(int studentId, String studentName, int studentAge) {
    String sql = "INSERT INTO students (stdid, stdname, stdage) VALUES (?, ?, ?)";
    try (Connection conn = connect();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setInt(1, studentId);
          stmt.setString(2, studentName);
       stmt.setInt(3, studentAge);
      int rowsInserted = stmt.executeUpdate();
       System.out.println(rowsInserted + " student(s) inserted successfully.");
    } catch (SQLException ex) {
      System.out.println("Error inserting student:");
      ex.printStackTrace();
    }
  }
  public void updateStudent(int studentId, String newName, int newAge) {
    String sql = "UPDATE students SET stdname = ?, stdage = ? WHERE stdid = ?";
    try (Connection conn = connect();
     PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, newName);
      stmt.setInt(2, newAge);
      stmt.setInt(3, studentId);
      int rowsUpdated = stmt.executeUpdate();
      System.out.println(rowsUpdated + " student record(s) updated successfully.");
    } catch (SQLException ex) {
      System.out.println("Error updating student:");
      ex.printStackTrace();
    }
  }
  public static void main(String[] args) {
    DataInsAndUpd dao = new DataInsAndUpd();
    dao.addStudent(4, "Kavi", 22);
    dao.updateStudent(4, "Kavitha", 23);
  }
}
