<%--
  Created by IntelliJ IDEA.
  User: curry
  Date: 18-12-5
  Time: 下午9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html lang="en">
<head>
    <title>Title</title>
</head>
<body>

<c:url value="/resources/test.txt" var="url"/>
<spring:url value="/resources/text.txt" htmlEscape="true" var="springUrl"/>

SpringUrl:${springUrl} at ${time}
<br/>
JSTL URL:${url}
<br/>
message: ${message}

</body>
</html>
