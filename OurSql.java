import java.sql.*;  

public class OurSql{  
   public static void main(String args[]){  
      try{  
         Class.forName("com.mysql.jdbc.Driver");  //The driver class for the mysql database
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");  //connection URL for the sql database
         //here sonoo is database name, root is username and password  
         Statement state = con.createStatement();  
         ResultSet result = state.executeQuery("select * from emp");  //emp is table name
         while(result.next())  
            System.out.println(result.getInt(1)+"  "+result.getString(2)+"  "+result.getString(3));  
            con.close();  
      }
      catch(Exception e){ System.out.println(e);}  
     }  
}  