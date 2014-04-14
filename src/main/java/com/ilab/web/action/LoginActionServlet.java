package com.ilab.web.action;

import javax.servlet.*;
import java.io.IOException;


/**
 * Created by Xiang on 4/9/2014.
 */
public class LoginActionServlet implements Servlet {

//    // 响应登陆请求
//    public ActionForward login(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
//
//        EmployeeForm employeeForm = (EmployeeForm) form;
//        if("123".equals(employeeForm.getPwd()))
//        {
//            return mapping.findForward("ok");
//        }
//        else
//        {
//            return mapping.findForward("err");
//        }
//
//    }
//
//    // 响应注销请求
//    public ActionForward logout(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        return super.execute(mapping, form, request, response);
//    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        String flag = request.getParameter("flag");
        if(flag.equals("login"))
        {
            String username = (String) request.getParameter("id");
            String password = (String) request.getParameter("pwd");
            if(username.equals("1") && password.equals("123"))
            {
                request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
            }
            else
            {
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        if(flag.equals("logout"))
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
