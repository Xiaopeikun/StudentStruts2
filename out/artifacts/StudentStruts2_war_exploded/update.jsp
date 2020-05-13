<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/4/13
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<s:url action="update" />" method="post">
        <label>
            学号:<input type="text" name="id" value="${studentEntity.id}">
            姓名:<input type="text" name="name" value="${studentEntity.name}">
            年龄:<input type="text" name="age" value="${studentEntity.age}">
            性别:<input type="text" name="sex" value="${studentEntity.sex}">
            <input type="submit" value="添加">
        </label>
    </form>
</body>
</html>
