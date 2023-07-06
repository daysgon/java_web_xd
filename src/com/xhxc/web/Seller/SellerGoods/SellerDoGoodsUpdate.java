package com.xhxc.web.Seller.SellerGoods;

import com.xhxc.dao.GoodsDao;
import com.xhxc.pojo.Goods;
import com.xhxc.util.FileUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;

@MultipartConfig
@WebServlet("/sell/doGoodsUpdate")
public class SellerDoGoodsUpdate extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String goodsname = req.getParameter("goodsname");
        String message = req.getParameter("message");
        double price = Double.parseDouble(req.getParameter("price"));
        int store = Integer.parseInt(req.getParameter("store"));
        int hid = Integer.parseInt(req.getParameter("hid"));
        int uid = Integer.parseInt(req.getParameter("uid"));
        int active = Integer.parseInt(req.getParameter("active"));

        Part part = req.getPart("img");
        String fileName = part.getSubmittedFileName();
        String path = "E:\\Git\\warehouse\\java_web_xd\\web\\image\\"+fileName;
        InputStream inputStream = part.getInputStream();
        FileUtil.storeFile(inputStream,path);

//        数据库存储的图片的访问路径
        String dbPath = "http://localhost:8080/image/"+fileName;
        Goods g = new Goods();
        g.setId(id);
        g.setUid(uid);
        g.setGoodsname(goodsname);
        g.setMessage(message);
        g.setHid(hid);
        g.setActive(active);
        g.setStore(store);
        g.setPrice(price);
        g.setImg(dbPath);
        int a = dao.update(g);
        System.out.println(g);
        if(a>0) {
            resp.sendRedirect("/sell/goods");
        }else{
            req.setAttribute("msg","修改失败");
            req.getRequestDispatcher("/back/fail.jsp").forward(req,resp);
        }
    }
}
