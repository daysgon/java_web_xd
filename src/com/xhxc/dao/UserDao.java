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
                    Date date = rs.getDate("create_time");
                    String address = rs.getString("address");

                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
                    user.setEmail(email);
                    user.setAddress(address);
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
                    Date date = rs.getDate("create_time");
                    String address = rs.getString("address");
                    user.setAddress(address);
                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
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
        return JDBCUtil.executeUpdate("insert into user(username,password,phone,email,active,role,address,create_time) values(?,?,?,?,?,?,?,now())"
                ,user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail(),user.getActive(),user.getRole(),user.getAddress());
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
                    String address = rs.getString("address");
                    Date date = rs.getDate("create_time");
                    user.setAddress(rs.getString("address"));
                    user.setId(id);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(role);
                    user.setPhone(phone);
                    user.setActive(active);
                    user.setEmail(email);
                    user.setAddress(address);
                    user.setCreateTime(date);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return user;
            }
        }, id);
    }

    public int update(User user){
        return JDBCUtil.executeUpdate("update user set username=?,password=?,phone=?,email=? ,address=? where id=?",
                user.getUsername(),user.getPassword(),user.getPhone(),user.getEmail(),user.getAddress(),user.getId());
    }

    public int delete(int id)
    {return  JDBCUtil.executeUpdate("update user set active=0 where id =?",
            id);


    }




}
