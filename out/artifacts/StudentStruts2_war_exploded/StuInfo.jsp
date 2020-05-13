<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/4/13
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>学生信息维护页面</title>
    <script type="text/javascript">
        function add() {
            location.href="${pageContext.request.contextPath}/add.jsp"
        }
    </script>
</head>
<body>
    <table border="0" width="50%" cellpadding="0" cellspacing="1" bgcolor="#ACDDEC">
        <tr bgcolor="#fff">
            <td>学号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td style="text-align: center;">操作</td>
        </tr>
        <c:forEach items="${list}" var="studentEntity">
            <tr>
                <td>${studentEntity.id}</td>
                <td>${studentEntity.name}</td>
                <td>${studentEntity.sex}</td>
                <td>${studentEntity.age}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/delete?id=${studentEntity.id}">删除</a>
                    <a>|</a>
                    <a href="${pageContext.request.contextPath}/toupdate?id=${studentEntity.id}">更新</a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <button onclick="add()">添加</button>
</body>
</html>
