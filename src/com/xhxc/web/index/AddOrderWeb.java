package com.xhxc.web.index;

import com.xhxc.dao.GoodsDao;
import com.xhxc.dao.OrderDao;
import com.xhxc.dao.UserDao;
import com.xhxc.pojo.Goods;
import com.xhxc.pojo.Order;
import com.xhxc.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/addOrder")
public class AddOrderWeb extends HttpServlet {
    private GoodsDao dao = new GoodsDao();
    private UserDao dao1 = new UserDao();
    private OrderDao dao2 = new OrderDao();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int goodsId = Integer.parseInt(req.getParameter("goodsId"));
        Goods goods = new Goods();
        goods = dao.getOneById(goodsId);
        int num =Integer.parseInt(req.getParameter("num"));
        int store = goods.getStore();

//        System.out.println(goodsId);
//        System.out.println(num);
//        System.out.println(goods);

        if(store>=num){
            HttpSession session = req.getSession();
            User user=(User)session.getAttribute("user");
            System.out.println(user);
            Order order=new Order();
            order.setPurchaserId(user.getId());
            order.setGoodId(goods.getId());
            order.setGoodName(goods.getGoodsname());
            order.setSellerId(goods.getUid());
            order.setSellerName(user.getUsername());
            order.setPrice(goods.getPrice());
            order.setAmount(num);
            order.setAddress(user.getAddress());
            System.out.println(order);
            int add = dao2.add(order);
            if(add>0){
//        成功添加后，进行数据的显示  表所有数据，条列表页
                goods.setStore(goods.getStore()-num);
                dao.update(goods);
                req.setAttribute("msg","订单已加入购物车");
                req.setAttribute("goodid",goodsId);
                req.getRequestDispatcher("/orderfail.jsp").forward(req,resp);
            }else{
                req.setAttribute("msg","订单添加失败");
                req.setAttribute("goodid",goodsId);
                req.getRequestDispatcher("/orderfail.jsp").forward(req,resp);
            }
        }
        else{
            req.setAttribute("msg","订单添加失败 库存不足");
            req.getRequestDispatcher("/orderfail.jsp").forward(req,resp);
        }
    }
}

