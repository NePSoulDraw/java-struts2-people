
package com.people.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.*;

@Results({
    @Result(name = "success", location = "/WEB-INF/content/welcome.jsp"),
    @Result(name = "input", type = "redirectAction", location = "login") 
})
public class ValidateUserAction extends ActionSupport{
    
    private String user;
    
    private String password;

    @Action("validateUser")
    public String execute(){
        
        if("admin".equals(this.user)){

            return SUCCESS;

        }else{

            return INPUT;
            
        }
    
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
