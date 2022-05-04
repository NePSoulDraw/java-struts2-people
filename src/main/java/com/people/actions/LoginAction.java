
package com.people.actions;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
    
    private String user;
    
    private String password;
    
    public String execute(){
        
        return SUCCESS;
        
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPropertieUser(){
        return getText("form.user");
    }
    
    public String getPropertiePassword(){
        return getText("form.password");
    }
    
    public String getPropertieButton(){
        return getText("form.button");
    }
    
    public String getPropertieTitle(){
        return getText("form.title");
    }
    
    public String getPropertieValues(){
        return getText("form.values");
    }
    
    
}
