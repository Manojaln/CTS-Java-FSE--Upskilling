import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class TransHandle{
public static void main(String[] args){
	String dbUrl="jdbc:mysql://localhost:3306/students";
	String dbUser="root";
	String dbPass="manoj0512";
	try(Connection conn=DriverManager.getConnection(dbUrl,dbUser,dbPass)){
	conn.setAutoCommit(false);
	try	{
	String balanceCheckSql="SELECT balance FROM accounts WHERE id=?";
	try(PreparedStatement balanceStmt=conn.prepareStatement(balanceCheckSql)){
	balanceStmt.setInt(1,1);
	ResultSet rs=balanceStmt.executeQuery();
if(rs.next())	{
double balance=rs.getDouble("balance");

if(balance<100){
throw new SQLException("Not enough funds to debit.");
}
}
}
String debitSql="update accounts SET balance = balance - ? WHERE id = ?";
try(PreparedStatement debitStmt=conn.prepareStatement(debitSql)){
debitStmt.setDouble(1,100);
debitStmt.setInt(2,1);
int debitedRows=debitStmt.executeUpdate();
System.out.println(debitedRows+" row(s) debited.");
}
String creditSql="Update accounts SET balance = balance + ? WHERE id = ?";
try(PreparedStatement creditStmt=conn.prepareStatement(creditSql)){
creditStmt.setDouble(1,100);
creditStmt.setInt(2,2);
int creditedRows=creditStmt.executeUpdate();
System.out.println(creditedRows+" row(s) credited.");
}
conn.commit();
System.out.println("Transaction done ");
}catch(SQLException ex){
conn.rollback();
System.out.println("Transaction failed and was rolled back.");
ex.printStackTrace();
}
}catch(SQLException e){
e.printStackTrace();
}
}
}
