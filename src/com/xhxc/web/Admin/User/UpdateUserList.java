/*点击修改之后跳转用户信息修改界面



*/
package com.xhxc.web.Admin.User;

import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admin/updateuserlist")
public class UpdateUserList extends HttpServlet {
    private UserDao dao=new UserDao();

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        User oneById=dao.getOneById(id);
        req.setAttribute("user",oneById);
        req.getRequestDispatcher("/admin/updateUserList.jsp").forward(req,resp);
    }
}
