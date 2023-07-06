package com.xhxc.web.Admin.Handle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/admin/handlelist")
public class HandleList extends HttpServlet {
    private HandleDao dao=new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        User user=(User)session.getAttribute("user");
        if(user==null)
        {req.setAttribute("msg","请登录");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);

        }
       else {
            ArrayList<Handle> allhandles = dao.getAll();
            req.setAttribute("allhandles", allhandles);
            req.getRequestDispatcher("/admin/handleList.jsp").forward(req, resp);
        }
    }
}
