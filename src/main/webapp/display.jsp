<%@page import="dto.StudentDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%List<StudentDetails> list=(List<StudentDetails>)session.getAttribute("list"); %>
<table border="">
<tr>
<th>Name</th>
<th>Subject1 Marks</th>
<th>Subject2 Marks</th>
<th>Subject3 Marks</th>
<th>Subject4 Marks</th>
<th>Subject5 Marks</th>
<th>Subject6 Marks</th>
<th>Percentage</th>
</tr>
<%for(StudentDetails details:list){ %>
<tr>
<th><%=details.getName()%></th>
<th><%=details.getSub1Marks()%></th>
<th><%=details.getSub2Marks()%></th>
<th><%=details.getSub3Marks()%></th>
<th><%=details.getSub4Marks()%></th>
<th><%=details.getSub5Marks()%></th>
<th><%=details.getSub6Marks()%></th>
<th><%=details.getPercentage()%></th>
</tr>
<%} %>

</table>
</body>
</html>