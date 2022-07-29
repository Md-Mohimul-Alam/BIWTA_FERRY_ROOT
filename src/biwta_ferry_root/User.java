/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biwta_ferry_root;

import java.net.URL;
import java.util.ResourceBundle;

/**
 *
 * @author Asus
 */

   abstract class User {
    private String UserId;
    private String pass;
    
    public User(String UserId, String pass){

        this.UserId = UserId;
        this.pass = pass;
    }
    
    public String getUserId(String UserId){
        return UserId;
    }
    
    public void setUserId(String UserId){
       this.UserId = UserId;
    }
    
    public String getpass(String pass){
           return pass;
    }
    
    public void setpass(String pass){
        this.pass = pass;
    }
    class Admin extends User{ 

        public Admin(String UserId, String pass) {
            super(UserId, pass);
        }  
    }
       public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    
}
