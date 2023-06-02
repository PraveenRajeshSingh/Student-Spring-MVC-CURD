<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Form</title>
</head>
<body>
    <h2>Student Form</h2>
    <form method="post" modelAttribute="student" action="update">
        <c:if test="${student.id != null}">
            <input type="hidden" name="id" value="${student.id}" />
        </c:if>
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" value="${student.name}" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" value="${student.age}" required><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="${student.email}" required><br><br>
        
        <input type="submit" value="Save">
    </form>
</body>
</html>