
package com.people.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name = "success", location = "/WEB-INF/content/welcome.jsp"),
    @Result(name = "input", location = "/WEB-INF/content/login.jsp")
})
public class ValidateUserAction extends ActionSupport{
    
    private String user;
    
    private String password;

    @Action("validateUser")
    public String execute(){
        
        if("admin".equals(this.user)){
            
            addActionMessage(getText("user.valid"));
            
            return SUCCESS;

        }else{

            return INPUT;
            
        }
    
    }
    
    @Override
    public void validate(){
        
        if(this.user == null || "".equals(this.user.trim())){
            
            addFieldError("user", getText("validation.user"));
            
        } else if(!userIsValid()){
            
            addActionError(getText("user.not.valid"));
            
        }
        
        if(this.password == null || "".equals(this.password.trim())){
            
            addFieldError("password", getText("validation.password.empty"));
            
        } else if(this.password.length() < 3){
            
            addFieldError("password", getText("validation.password.min.length"));
            
        }
        
    }
    
    private boolean userIsValid(){
        
        return "admin".equals(this.user);
        
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
    
}
