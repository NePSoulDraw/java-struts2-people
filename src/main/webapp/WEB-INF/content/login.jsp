<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="propertieTitle" /></title>
    </head>
    <body>
        
        <h1>
            <s:property value="propertieTitle" />
        </h1>
        
        <s:form>
            
            <s:textfield key="form.user" name="user" />
            <s:password key="form.password" name="password" />
             
            <s:submit key="form.button" name="submit" />
            
        </s:form>
        
        <br />
        
        <div>
            <s:text name="form.values" />:
            
            <br />
            <br />
            
            <b><s:property value="propertieUser" />:</b> <s:property value="user" />
            
            <br />
            <b><s:property value="propertiePassword" />:</b> <s:property value="password" />
        </div>
        
    </body>
</html>