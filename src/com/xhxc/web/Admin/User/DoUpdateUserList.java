//执行更新用户信息
package com.xhxc.web.Admin.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/doupdateuserlist")
public class DoUpdateUserList extends HttpServlet {
private UserDao dao=new UserDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
       String address = req.getParameter("address");

        User user =new User();
        user.setAddress(address);
        user.setEmail(email);
        user.setId(id);
        user.setUsername(username);
        user.setPhone(phone);
        user.setPassword(password);
        //修改成功-返回用户列表；修改失败-跳转提示界面
        int update =dao.update(user);
        if(update>0)
            {resp.sendRedirect("/admin/userlist");

            }
        else
            {
                req.setAttribute("msg","修改失败");
                req.getRequestDispatcher("/fail.jsp").forward(req,resp);

            }


    }














}
