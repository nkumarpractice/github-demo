<%@ page import = "java.sql.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ADF 2.0 Java</title>
</head>
<!-- Linking to the CSS file  -->
<link rel="stylesheet" type="text/css" href="css/CssDemo.css">
<body>

<% 

String INSERT_QUERY = "insert into Student values(?,?,?)";

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost/faculty","root","admin"); 
PreparedStatement ps = con.prepareStatement(INSERT_QUERY);

String id = request.getParameter("studentId");
String name = request.getParameter("studentName");
String courseId = request.getParameter("courseId");

ps.setString(1,id);
ps.setString(2,name);
ps.setString(3,courseId);

int rows = ps.executeUpdate();
out.println("<H1>");
out.println(rows + " record added");
out.println("</H1>");
%>

</body>
</html>