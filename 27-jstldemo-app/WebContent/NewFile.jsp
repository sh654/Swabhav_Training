<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Included Content</title>
</head>
<body>
    <h2>This content is imported from NewFile.jsp</h2>
    <c:out value="This is some additional content"></c:out>

    <%-- You can add any other content here --%>
    <c:set var="importedNumber" value="10" />
    <c:out value="Imported Number: ${importedNumber}" />
</body>
</html>
