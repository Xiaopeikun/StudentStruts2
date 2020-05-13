package com.baconic.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class LoginAction extends ActionSupport {

    private String username;
    // 定义登录名称属性
    private String password;

    // 定义登录密码属性

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if (this.username.equals("admin") && this.password.equals("123")) {
            Map session = ActionContext.getContext().getSession();
            session.put("login", username);
            return SUCCESS; // 登录成功返回SUCCESS
        } else {
            return LOGIN; // 登录失败返回LOGIN
        }
    }

    // 登录验证
    public String checkLogin() {
        if (this.username.equals("admin") && this.password.equals("123"))
            return SUCCESS; // 登录成功返回SUCCESS
        else
            return LOGIN; // 登录失败返回LOGIN
    }

}
