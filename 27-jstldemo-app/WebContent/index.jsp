<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <!-- Output a simple string -->
    <c:out value="Shivam"></c:out>

    <!-- Set and output a session-scoped variable -->
    <c:set var="name" scope="session" value="Upadhyay"></c:set>
    <c:out value="${name}"></c:out>

    <!-- Import the content of NewFile.jsp -->
    <c:import url="NewFile.jsp" />

    <!-- JSP code block to set an attribute -->
    <%pageContext.setAttribute("importedNumber", 5); %>

    <!-- Conditional output based on the number attribute -->
    <c:if test="${importedNumber % 2 == 0}">
        <c:out value="Even"></c:out>
    </c:if>
    
    <c:out value="Hello Shubham"></c:out>

</body>
</html>
