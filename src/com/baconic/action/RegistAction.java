package com.baconic.action;

import com.opensymphony.xwork2.ActionSupport;

public class RegistAction extends ActionSupport {
    private String registname;
    private String registpassword;

    public String getRegistname() {
        return registname;
    }

    public void setRegistname(String registname) {
        registname = registname;
    }

    public String getRegistpassword() {
        return registpassword;
    }

    public void setRegistpassword(String registpassword) {
        this.registpassword = registpassword;
    }

    public String checkRegist() {

        if (registname.equals(null) && registpassword.equals(null)) {
            return "regist";
        } else {
            return "success";
        }
    }

}
