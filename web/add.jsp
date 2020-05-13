<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/4/13
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/add" method="post">
        学号:<input type="text" name="id" value="">
        姓名:<input type="text" name="name" value="">
        年龄:<input type="text" name="age" value="">
        性别:<input type="text" name="sex" value="">
        <input type="submit" value="添加">
    </form>
</body>
</html>
