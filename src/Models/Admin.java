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
public class Admin {
    
     private String name;
    private String email;
    private String password;
    
    
    public Admin(){
        
    }
    
    public Admin(String email,String password){
       this.setAEmail(email);
       this.setAPassword(password);
    }

    public void setAName(String name){
        this.name=name;
    }
    
    public String getAName(){
        return name;
    }
    
      public void setAEmail(String email){
        this.email=email;
    }
      public String getAEmail(){
        return email;
    }
    
    public void setAPassword(String password){
         this.password=password;
    }
    
    public String getAPassword(){
        return password;
    }
    
}
