<%@page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
 
<%@taglib prefix="kendo" uri="http://www.kendoui.com/jsp/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="demo" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>




<form:form method="POST" action="login">
   <table>
    <tr>
        <td><form:label path="userName">Name</form:label></td>
        <td><form:input path="userName" /></td>
    </tr>
    <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input type="password" path="password" /></td>
    </tr>
     <tr>
        <td><form:label path="age">Age</form:label></td>
        <td><form:input path="age" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
<%-- <form method="post" action="login">
	<div class="configuration k-widget k-header">
		 
	  <label for="user_name">User Name:</label>
	  <input name="userName" type="text" class="k-textbox" />
	    <label for="password">Password:</label>
	  
	   <input name="password" type="password" class="k-textbox" />
	 
		<kendo:button name="textButton" type="submit" click="onClick">
    <kendo:button-content>
        Login
    </kendo:button-content>
</kendo:button>
	</div>
	<script>
    function onClick(e) {
   //    windows.document.form.login. click (" + $(e.event.target).closest(".k-button").attr("id") + ")");
    }
</script>
	
</form> --%>
