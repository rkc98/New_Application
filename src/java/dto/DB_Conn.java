package dto;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.*;

public class DB_Conn {

    private String database="website", username = "root", password = "root";
    private Connection con;
    
    public Connection getConnection() throws SQLException, ClassNotFoundException  {
        Class.forName("org.apache.derby.jdbc.ClientDriver"); 
        con=DriverManager.getConnection("jdbc:derby://localhost:1527/"+database+"",""+username+"",""+password+""); 
       // stm=con.createStatement(); 
        return con;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
