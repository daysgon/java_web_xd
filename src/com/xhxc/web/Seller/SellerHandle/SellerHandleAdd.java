package com.xhxc.web.Seller.SellerHandle;

import com.xhxc.dao.HandleDao;
import com.xhxc.pojo.Handle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/sell/handleAdd")
public class SellerHandleAdd extends HttpServlet {
    private HandleDao dao = new HandleDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Handle> handlesByParentId = dao.getHandlesByParentId();
        req.setAttribute("all",handlesByParentId);
        req.getRequestDispatcher("/sell/handleAdd.jsp").forward(req,resp);
    }
}
