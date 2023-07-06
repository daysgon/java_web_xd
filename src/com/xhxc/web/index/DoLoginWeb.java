package com.xhxc.web.index;


import com.xhxc.dao.UserDao;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/index/doLogin")
public class DoLoginWeb extends HttpServlet {
    private UserDao dao=new UserDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        接收表单中的数据  name属性中的值
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        int role = Integer.parseInt(req.getParameter("role"));
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(role);
        User user = dao.getOneByUsernameAndPassword(username, password);
//        System.out.println(user);

        String piccode = (String) req.getSession().getAttribute("piccode");
        String checkCode = req.getParameter("checkCode");
        System.out.println(piccode);
        System.out.println(checkCode);
        resp.setContentType("text/html;charset=utf-8");//解决乱码问题
        if (checkCode.equals(piccode)) {

            if(user==null){
//            跳到注册页面   注册买家、卖家
                resp.sendRedirect("/index/register");
            }else{
                if(user.getActive()==0){
                    req.setAttribute("msg","注销账号 不能登录");
                    req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
                }else{
                    if (user.getRole()==role && user.getRole()==0 ){
//  超级管理员          req.getRequestDispatcher("backList.jsp").forward(req,resp);
                        HttpSession session = req.getSession();
                        session.setAttribute("user",user);

                        resp.sendRedirect("/index");
                    }else if(user.getRole()==role && user.getRole()==1){
                        //卖家
                        HttpSession session = req.getSession();
                        session.setAttribute("user",user);
                        resp.sendRedirect("/index");
                    } else if(user.getRole()==role && user.getRole()==2){
//买家
                        HttpSession session = req.getSession();
                        session.setAttribute("user",user);
                        resp.sendRedirect("/index");
                    }else{
                        req.getRequestDispatcher("/index/login").forward(req,resp);
                    }
                }
            }

        } else {
            req.setAttribute("msg","验证码输入错误");
            req.getRequestDispatcher("/index/loginFail.jsp").forward(req,resp);
        }


    }
}
