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
public class Order {
    
     private String cemail;
    private String price;
    private String date;
    private String fulldate;


    
public Order(){
    
}
public Order(String cemail,String price,String date,String fulldate){
    this.setCemail(cemail);
    this.setPrice(price);
    this.setDate(date);
    this.setFulldate(fulldate);

    
}

    public String getCemail() {
        return cemail;
    }

    public String getPrice() {
        return price;
    }

    public String getDate() {
        return date;
    }

    public String getFulldate() {
        return fulldate;
    }

    public void setCemail(String cemail) {
        this.cemail = cemail;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setFulldate(String fulldate) {
        this.fulldate = fulldate;
    }

    
   
}
