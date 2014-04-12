package com.ilab.web.form;

import org.apache.struts.action.ActionForm;

/**
 * Created by Xiang on 4/9/2014.
 */
public class EmployeeForm extends ActionForm {

    private Integer id;
    private String pwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
