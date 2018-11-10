/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Database.StockDatabase;
import Models.Client;
import Models.Stock;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author HP OMEN
 */
public class StockController extends Stock {
    
    StockDatabase sdb;
    Connection con;
    PreparedStatement pst;
    Statement st;
    
    public StockController(){
        super();
         sdb = new StockDatabase();
         con = sdb.getConnection();
    }
    
    
   public int getBoissonStock(Stock s){
            String sql="";
            int qty=0;
            
                    ResultSet rs = null;

                try{                                                                           

            sql= "SELECT qty FROM boisson WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,s.getBoissonName());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                qty=rs.getInt("qty");

                return qty;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return qty;
      
        
    }
   
   
   public int getBoissonPrice(Stock s){
       String sql="";
       int price=0;
            ResultSet rs =null;
             try{                                                                           

            sql= "SELECT prix FROM boisson WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,s.getBoissonName());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                price=rs.getInt("prix");

                return price;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return price;
            
            
   }
   
   
     public ArrayList<Stock> getDrinksList(){
         ArrayList<Stock> drinkList= new ArrayList<Stock>();
         
       
       String query = "SELECT * FROM  `boisson` ";
       Statement st;
       ResultSet rs;
       
       try {
           st = con.createStatement();
           rs = st.executeQuery(query);

           Stock bstock;

           while(rs.next())
           {
bstock = new Stock(rs.getInt("id"),rs.getString("name"),rs.getInt("qty"),rs.getInt("prix"));
               drinkList.add(bstock);
           }

       } 
      catch (Exception e) {
           e.printStackTrace();
       }
       return drinkList;
     }
     
     //Updating Drinks 
     
          public int executeChange(JTextField tf1,JTextField tf2,JTextField tf3){
        String sql="";
        int res=0;
         ResultSet rs = null;
                     int qty =  Integer.parseInt(tf1.getText());
                     int price = Integer.parseInt(tf2.getText());
                     int id = Integer.parseInt(tf3.getText());
        try {
            sql ="UPDATE boisson SET `qty`= ? , `prix` = ? WHERE `id` = ?";

            pst = con.prepareStatement(sql);
            pst.setInt(1, qty);
            pst.setInt(2, price);
            pst.setInt(3,id);
            

              st = con.createStatement();
       
             res = pst.executeUpdate();
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return res;
    }
    
          
          
          //Getting Food Stock
          
             
   public int getFoodPrice(JLabel jl){
       String sql="";
       int price=0;
            ResultSet rs =null;
             try{                                                                           

            sql= "SELECT price FROM burgers WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,jl.getText());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                price=rs.getInt("price");

                return price;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return price;
            
            
   }
   
   
   //Pizza Price
   
     public int getPizzaPrice(JLabel jl){
       String sql="";
       int price=0;
            ResultSet rs =null;
             try{                                                                           

            sql= "SELECT price FROM pizza WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,jl.getText());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                price=rs.getInt("price");

                return price;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return price;
            
            
   }
     
     
     
       //Chicken Price
   
     public int getChickenPrice(JLabel jl){
       String sql="";
       int price=0;
            ResultSet rs =null;
             try{                                                                           

            sql= "SELECT price FROM chicken WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,jl.getText());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                price=rs.getInt("price");

                return price;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return price;
            
            
   }
          //Dessert Price
     
      public int getDessertPrice(JLabel jl){
       String sql="";
       int price=0;
            ResultSet rs =null;
             try{                                                                           

            sql= "SELECT price FROM dessert WHERE name = ?";
             pst = con.prepareStatement(sql);
            
            pst.setString(1,jl.getText());
           
            
            rs=pst.executeQuery();
            if(rs.next()){
                
                price=rs.getInt("price");

                return price;
            }

            
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        
        return price;
            
            
   }
   
   public int ChangeStock(JCheckBox cb,int qty){
       String sql="";
        int res=0;
         ResultSet rs = null;
                
        try {
            sql ="UPDATE boisson SET `qty`= ? WHERE `name` = ?";

            pst = con.prepareStatement(sql);
            pst.setInt(1, qty);
            pst.setString(2, cb.getText());
          

              st = con.createStatement();
       
             res = pst.executeUpdate();
            
            

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return res;
       
   }
          
}
