//执行添加用户信息到数据库
package com.xhxc.web.Admin.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/doadduserlist")
public class DoAddUserList extends HttpServlet {
    UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");

        int role = Integer.parseInt(req.getParameter("role"));
        int active = Integer.parseInt(req.getParameter("active"));
        User user =new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        user.setPhone(phone);
        user.setRole(role);
        user.setActive(active);
        user.setAddress(address);
        req.setAttribute("user",user);


//添加成功-跳转用户列表；添加失败-跳转失败界面
        int add=dao.add(user);
        if(add>0)
        {
            resp.sendRedirect("/admin/userlist");
        }
        else
        {   req.setAttribute("msg","添加失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }




    }
}
