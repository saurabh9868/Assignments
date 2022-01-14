package collection.list;
import java.sql.*;
import java.lang.*;

public class FirstJDBC {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="Saurabh@9868";
            Connection con=DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("connection is closed");
            }
            else{
                System.out.println("connection is not closed");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
