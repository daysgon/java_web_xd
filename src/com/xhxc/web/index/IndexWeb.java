package com.xhxc.web.index;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/index")
public class IndexWeb extends HttpServlet {
    private HandleDao fhandledao = new HandleDao();
    private HandleDao shandledao = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        列表显示
//        数据从数据库中进行获取 放到页面进行显示
        ArrayList<Handle> fhandle = fhandledao.getHandlesByParentId();//获取父类
        req.setAttribute("fhandle", fhandle);
        ArrayList<Handle> all = shandledao.getAll();//获取全部，以便找到属于父类的子类
        req.setAttribute("all",all);
        System.out.println(fhandle);
        System.out.println(all);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
