package com.xhxc.dao;



import com.xhxc.pojo.User;
import com.xhxc.util.JDBCUtil;
import com.xhxc.util.RowMap;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
    public User getOneByUsernameAndPassword(String username,String password){
        return JDBCUtil.QueryOne("select * from user where username=? and password=?", new RowMap<User>() {
            @Override
            public User rowMapping(ResultSet rs) {
                User user = new User();
                try {
                    int id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    int active = rs.getInt("active");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");
                    int role = rs.getInt("role");
                    String img = rs.getString("img");
                    Date date = rs.getDate("create_time");
                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
  //                  user.setImg(img);
                    user.setEmail(email);
                    user.setCreateTime(date);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, username, password);


    }

    public ArrayList<User> getAll(){
        return JDBCUtil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User rowMapping(ResultSet rs) {
                User user = new User();
                try {
                    int id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    int active = rs.getInt("active");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");
                    int role = rs.getInt("role");
                    String img = rs.getString("img");
                    Date date = rs.getDate("create_time");
                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
  //                  user.setImg(img);
                    user.setEmail(email);
                    user.setCreateTime(date);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        });
    }

    public int add(User user){
        return JDBCUtil.executeUpdate("insert into user(username,password,phone,email,active,role,create_time) values(?,?,?,?,?,?,now())"
                ,user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail(),user.getActive(),user.getRole());
    }

    //    根据id查一个
    public User getOneById(int id){
        return JDBCUtil.QueryOne("select * from user where id=?", new RowMap<User>() {
            @Override
            public User rowMapping(ResultSet rs) {
                User user = new User();
                try {
                    int id = rs.getInt("id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    int active = rs.getInt("active");
                    String phone = rs.getString("phone");
                    String email = rs.getString("email");
                    int role = rs.getInt("role");
                    String img = rs.getString("img");
                    Date date = rs.getDate("create_time");
                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
//                    user.setImg(img);
                    user.setEmail(email);
                    user.setCreateTime(date);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, id);
    }

    public int update(User user){
        return JDBCUtil.executeUpdate("update user set username=?,password=?,phone=?,email=? where id=?",
                user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail(),user.getId());
    }





}
