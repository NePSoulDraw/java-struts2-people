<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="welcome.title" /></title>
    </head>
    <body>
        
        <h1>
            <s:text name="welcome.title" />
        </h1>
        
        <h2>
            <s:text name="welcome.message" />:
        </h2>
        
        <br />
        
        <b><s:text name="form.user" />:</b> <s:property value="user" />
        
        <br />
        
        <b><s:text name="form.password" />:</b> <s:property value="password" />
        
    </body>
</html>
