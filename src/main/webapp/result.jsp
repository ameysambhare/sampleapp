<%@ page import ="java.util.*" %>
<%@ page import = "com.model.*"%>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Welcome <%=session.getAttribute("username")%>
</h1>
    <a href="index.html">Go back Now</a>
    <form action="findEmployee" method="POST">
        <label for="employeeid">Enter the employee id</label>
        <input type="number" name="employeeid" id="employeeid" max=1000 min=0 required/>
        <input type="hidden" name="username" value= <%=request.getParameter("username")%> />
        <input type="submit"/>
    </form>
    <br/>
    <% if(request.getAttribute("employee")!=null) {
        Employee e1 = (Employee) request.getAttribute("employee");
     %>
     <div>
        Employee Name: | <%=e1.getName()%>
     </div>
     <div>
     Employee Designation: | <%=e1.getDesignation()%>
     </div>
     <%}else if(request.getAttribute("error")!=null){
        String message = (String)request.getAttribute("error");
        %>
     <div style="color:red;"> <%=message%> </div>
     <%}%>
</body>
</html>
