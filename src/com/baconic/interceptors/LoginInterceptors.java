package com.baconic.interceptors;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import java.util.Map;

public class LoginInterceptors extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation arg0) throws Exception {

        String name = arg0.getInvocationContext().getName();
        if (name.equals("checkLogin")) {
            return arg0.invoke();
        } else {
            //验证是否登陆
            Map session = arg0.getInvocationContext().getSession();
            String username = (String) session.get("login");
            if (username == null) {
                return Action.LOGIN;
            } else {
                return arg0.invoke();
            }
        }
    }
}
