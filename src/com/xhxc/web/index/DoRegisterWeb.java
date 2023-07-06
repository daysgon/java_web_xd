package com.xhxc.web.index;


import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/index/doRegister")
public class DoRegisterWeb extends HttpServlet {
    private UserDao dao = new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        int role = Integer.parseInt(req.getParameter("role"));

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setPhone(phone);
        user.setEmail(email);
        user.setRole(role);
        user.setActive(1);
        System.out.println(user);

        String piccode = (String) req.getSession().getAttribute("piccode");
        String checkCode = req.getParameter("checkCode");
        System.out.println(piccode);
        System.out.println(checkCode);
        resp.setContentType("text/html;charset=utf-8");//解决乱码问题
        if (checkCode.equals(piccode)) {
            int add = dao.add(user);
            if(add>0){
                resp.sendRedirect("/index/login");
            }else{
                req.setAttribute("msg","添加失败 用户名已存在");
                req.getRequestDispatcher("/index/registerFail.jsp").forward(req,resp);
            }
        } else {
            req.setAttribute("msg"," 添加失败 验证码输入错误");
            req.getRequestDispatcher("/index/registerFail.jsp").forward(req,resp);
        }



    }
}
