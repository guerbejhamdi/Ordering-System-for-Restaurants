/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author HP OMEN
 */
public class Stock {
    
    private int pizzaStock;
    private String boissonName;
    private int id,qty,price;

  
    
    public Stock(){
        
    }
    public Stock(int id, String name , int qty , int price){
       this.setId(id);
       this.setBoissonName(name);
       this.setQty(qty);
       this.setPrice(price);
    }
    
    public void setPizzaStock(int pizzaStock){
        this.pizzaStock=pizzaStock;
    }
    
       public int getPizzaStock(){
         return pizzaStock;
     }

    
     public void setBoissonName(String boissonName){
        this.boissonName=boissonName;
    }

       public String getBoissonName(){
         return boissonName;
     }
       
       
         public void setId(int id) {
        this.id = id;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public int getPrice() {
        return price;
    }
       

    
}
