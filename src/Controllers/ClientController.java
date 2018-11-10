/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.Database;
import Models.Client;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author HP OMEN
 */
public class ClientController extends Client {
    
    Database db;
    Connection con;
    PreparedStatement pst,pst2;
        Statement st;

    
    public ClientController(){
        super();
        db = new Database();
        con = db.getConnection();
        
    }
    
    public int createAccount(Client c){
        int res =0;
        String sql = "";
        
        try{
           // sql = "INSERT INTO client('email','name','password') VALUES(?,?,?)";
           sql = "INSERT INTO client(`email`,`name`,`password`) values(?,?,?)";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,c.getEmail());
            pst.setString(2,c.getName());
            pst.setString(3,c.getPassword());
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }
    
    public boolean checkLogin(Client c){
        String sql= "";
     
        
        ResultSet rs = null;
        try{
            sql= "SELECT * FROM client WHERE email = ? and password = ?";
            pst = con.prepareStatement(sql);
            
            pst.setString(1,c.getEmail());
            pst.setString(2,c.getPassword());
            
            rs=pst.executeQuery();
            
          
            
            if(rs.next()){
              
                return true;
            }else{
                return false;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        
        return false;
    }
    
               //delete from here

    public String getClientName(Client c){
            String sqln="";
            String name="";
            
                    ResultSet rs = null;

                try{                                                                           

            sqln = "SELECT name FROM client WHERE email = ? AND password = ?";
             pst2 = con.prepareStatement(sqln);
            
            pst2.setString(1,c.getEmail());
            pst2.setString(2,c.getPassword());
            
            rs=pst2.executeQuery();
            if(rs.next()){
                
                name=rs.getString("name");

                return name;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return name;
       
        
    }
    
     public ArrayList<Client> getClientList(){
         ArrayList<Client> clientList= new ArrayList<Client>();
         
       
       String query = "SELECT * FROM  `client` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = con.createStatement();
           rs = st.executeQuery(query);

           Client client;

           while(rs.next())
           {
client = new Client(rs.getString("email"),rs.getString("name"),rs.getString("password"));
               clientList.add(client);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return clientList;
     }
     
     
     //Updating Client Info By Admin
     
     public int executeChange(JTextField tf1,JTextField tf2,JTextField tf3){
        String sql="";
        int res=0;
         ResultSet rs = null;
                     String name =  tf2.getText();
                     String password = tf3.getText();
                     String email = tf1.getText();
        try {
            sql ="UPDATE client SET `name`= ? , `password` = ? WHERE `email` = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, password);
            pst.setString(3,email);
            

              st = con.createStatement();
       
             res = pst.executeUpdate();
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
    
     
                   //REMOVE CLIENT
              
              
                  public int removeClient(JTextField tf){
        int res =0;
        String sql = "";
        String email = tf.getText();
        try{
           // sql = "INSERT INTO client('email','name','password') VALUES(?,?,?)";
           sql = "DELETE from client where `email`=?";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,email);
            
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }
                  
                  
       
    
}
