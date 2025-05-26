import java.util.*;
import java.sql.*;
// here i have used this jar file mysql-connector-j-9.3.0.jar
public class JdbcEg{
public static void main(String args[]){
String url ="jdbc:mysql://localhost:3306/school"; 
String user="root";
String password ="manoj0512";
try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection co = DriverManager.getConnection(url  ,user, password);
	String qry = "select * from students";
	Statement st= co.createStatement();
	ResultSet rst = st.executeQuery(qry);
	while (rst.next()){
	int stdid = rst.getInt("stdid");
	String stdname= rst.getString("stdname");
	int stdage = rst.getInt("stdage");
System.out.println("ID: " + stdid + ", Name: " + stdname + ", Age: "+stdage);
}
rst.close();
st.close();
co.close();

}catch(Exception e){
	e.printStackTrace();
	}

}
}