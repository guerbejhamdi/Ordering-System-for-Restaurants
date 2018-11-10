/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.AdminDataBase;
import Database.Database;
import Models.Admin;
import Models.Client;
import Models.Order;
import Models.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP OMEN
 */
public class AdminController extends Admin{
    
     AdminDataBase adb;
     Database cdb;
    Connection con,ccon;
    PreparedStatement pst,pst2;
    Statement st;
    
    public AdminController(){
        super();
        adb = new AdminDataBase();
        con = adb.getConnection();
       // ccon = cdb.getConnection();
        
    }
    
    
    
     public boolean checkALogin(Admin a){
        String sql = "";

        ResultSet rs = null;
        try {
            sql = "SELECT * FROM admin WHERE email = ? and password = ?";
            pst = con.prepareStatement(sql);

            pst.setString(1, a.getAEmail());
            pst.setString(2, a.getAPassword());

            rs = pst.executeQuery();

            if (rs.next()) {

                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
     
      public ArrayList<Admin> getAdminList(){
         ArrayList<Admin> adminList= new ArrayList<Admin>();
         
       
       String query = "SELECT * FROM  `admin` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = con.createStatement();
           rs = st.executeQuery(query);

           Admin admin;

           while(rs.next())
           {
admin = new Admin(rs.getString("email"),rs.getString("password"));
               adminList.add(admin);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return adminList;
     }
      
      
      //Getting Client Orders
       public ArrayList<Order> getOrderList(){
         ArrayList<Order> orderList= new ArrayList<Order>();
         
       
       String query = "SELECT * FROM  `clientorder` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = con.createStatement();
           rs = st.executeQuery(query);

           Order order;

           while(rs.next())
           {
order = new Order(rs.getString("cemail"),rs.getString("price"),rs.getString("date"),rs.getString("fulldate"));
               orderList.add(order);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return orderList;
     }
      
      
      //
      //UPDATING ADMIN
      
      
          public int executeChange(JTextField tf1,JTextField tf2){
        String sql="";
        int res=0;
         ResultSet rs = null;
                     String email =  tf1.getText();
                     String password =tf2.getText();
                     
        try {
            sql ="UPDATE admin SET `password`= ? WHERE `email` = ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, password);
            pst.setString(2, email);
        
            

              st = con.createStatement();
       
             res = pst.executeUpdate();
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
          
          
          //ADD ADMIN
          
              public int newAdmin(Admin a){
        int res =0;
        String sql = "";
        
        try{
          
           sql = "INSERT INTO admin(`email`,`password`) VALUES(?,?)";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,a.getAEmail());
            pst.setString(2,a.getAPassword());
            
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }
          
              
              //REMOVE ADMIN
              
              
                  public int removeAdmin(JTextField tf){
        int res =0;
        String sql = "";
        String email = tf.getText();
        try{
           // sql = "INSERT INTO client('email','name','password') VALUES(?,?,?)";
           sql = "DELETE from admin where `email`=?";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,email);
            
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }
          
                
                  public int AddOrder(String email,String orderprice,JLabel dl,JLabel jl){
                      
                        int res =0;
        String sql = "";
        
        try{
           // sql = "INSERT INTO client('email','name','password') VALUES(?,?,?)";
           sql = "INSERT INTO clientorder(`cemail`,`price`,`date`,`fulldate`) values(?,?,?,?)";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,email);
            pst.setString(2,orderprice);
            pst.setString(3,dl.getText());
            pst.setString(4,jl.getText());
            
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
                      
                      
                      
                      
                      
                      
                      
                      
                  }
                  
                  
                  
                  
                  //ConfirmOrder
                      public int ConfirmOrder(JTextField tf){
        int res =0;
        String sql = "";
        String date = tf.getText();
        try{
           // sql = "INSERT INTO client('email','name','password') VALUES(?,?,?)";
           sql = "DELETE from clientorder where `date`=?";

            pst = con.prepareStatement(sql);
           // pst.setString(1,c.getName());
            pst.setString(1,date);
            
            
            res = pst.executeUpdate();

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return res;
    }
        
   
     
        
}
