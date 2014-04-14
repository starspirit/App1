package com.ilab.web.action;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by Xiang on 4/13/2014.
 */
public class EmployeeNavController implements Servlet {
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
        if(flag.equals("add"))
        {
            request.getRequestDispatcher("WEB-INF/addEmployee.jsp").forward(request, response);
        }
        if(flag.equals("list"))
        {
            request.getRequestDispatcher("WEB-INF/employeeList.jsp").forward(request, response);
        }
        if(flag.equals("find"))
        {
            request.getRequestDispatcher("WEB-INF/findEmployee.jsp").forward(request, response);
        }
        if(flag.equals("backToPanel"))
        {
            request.getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
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
