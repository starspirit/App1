package com.ilab.web.action;

import com.ilab.web.form.EmployeeForm;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by Xiang on 4/9/2014.
 */
public class LoginAction extends DispatchAction{

    // 响应登陆请求
    public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        EmployeeForm employeeForm = (EmployeeForm) form;
        if("123".equals(employeeForm.getPwd()))
        {
            return mapping.findForward("ok");
        }
        else
        {
            return mapping.findForward("err");
        }

    }

    // 响应注销请求
    public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        return super.execute(mapping, form, request, response);
    }
}
