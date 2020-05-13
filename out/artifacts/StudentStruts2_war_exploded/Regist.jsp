<%--
  Created by IntelliJ IDEA.
  User: 酩酊大醉
  Date: 2020/4/4
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
    <div style="margin: 30px 50px 20px 50px; text-align: center">
        <div style="font-size: 14px; font-weight: bold">用户注册</div>
        <div align="center">
            <s:form action="regist" namespace="/">
                <s:textfield name="registname" style="font-size:12px;width: 120px;"
                             label="注册名称"></s:textfield>
                <s:password name="registpassword" style="font-size:12px;width:120px;"
                            label="注册密码"></s:password>
                <s:submit value=" 注册 "></s:submit>
            </s:form>
        </div>
    </div>
</body>
</html>
