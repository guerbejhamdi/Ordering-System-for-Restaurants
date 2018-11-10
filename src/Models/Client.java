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
public class Client {
    
    private String name;
    private String email;
    private String password;
    
public Client(){
    
}
public Client(String email,String name,String password){
    this.setEmail(email);
    this.setName(name);
    this.setPassword(password);

    
}
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }
    
      public void setEmail(String email){
        this.email=email;
    }
      public String getEmail(){
        return email;
    }
    
    public void setPassword(String password){
         this.password=password;
    }
    
    public String getPassword(){
        return password;
    }
    
    
}
