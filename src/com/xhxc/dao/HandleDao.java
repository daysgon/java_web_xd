package com.xhxc.dao;

import com.xhxc.pojo.Handle;
import com.xhxc.util.JDBCUtil;
import com.xhxc.util.RowMap;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HandleDao {
    public ArrayList<Handle> getHandlesByParentId(){
        return JDBCUtil.executeQuery("select * from handle where parent_id = 0 and active=1", new RowMap<Handle>() {
            @Override
            public Handle rowMapping(ResultSet rs) {
                Handle handle = new Handle();
                try {
                    handle.setId(rs.getInt("id"));
                    handle.setName(rs.getString("name"));
                    handle.setParentId(rs.getInt("parent_id"));
                    handle.setActive(rs.getInt("active"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return handle;
            }
        });
    }
    public ArrayList<Handle> getAll(){
        return JDBCUtil.executeQuery("select * from handle", new RowMap<Handle>() {
            @Override
            public Handle rowMapping(ResultSet rs) {
                Handle handle = new Handle();
                try {
                    handle.setId(rs.getInt("id"));
                    handle.setName(rs.getString("name"));
                    handle.setParentId(rs.getInt("parent_id"));
                    handle.setActive(rs.getInt("active"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return handle;
            }
        });
    }



    public Handle getOneById(int id)
    {  return JDBCUtil.QueryOne("select *from handle where id=?", new RowMap<Handle>() {
        @Override
        public Handle rowMapping(ResultSet rs)
        {Handle handle=new Handle();
            try {

                String name=rs.getString("name");
                int id=rs.getInt("id");
                int active = rs.getInt("active");
                int parentId =rs.getInt("parent_id");
                handle.setParentId(parentId);
                handle.setName(name);
                handle.setId(id);
                handle.setActive(active);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return handle;


        }
    },id);

    }

    public ArrayList<Handle> getHandles() {
        return JDBCUtil.executeQuery("select * from handle where parent_id != 0 and active=1", new RowMap<Handle>() {
            @Override
            public Handle rowMapping(ResultSet rs) {
                Handle handle = new Handle();
                try {
                    handle.setId(rs.getInt("id"));
                    handle.setName(rs.getString("name"));
                    handle.setParentId(rs.getInt("parent_id"));
                    handle.setActive(rs.getInt("active"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return handle;
            }
        });
    }


    public int add(Handle handle) {
        return JDBCUtil.executeUpdate("insert into handle(name,parent_id,active) values(?,?,?)",handle.getName(),handle.getParentId(),handle.getActive());
    }


    public int delete(int id)
    {return  JDBCUtil.executeUpdate("update handle set active=0 where id =?",
            id);


    }

    public int active(int id)
    {return  JDBCUtil.executeUpdate("update handle set active=1 where id =?",
            id);


    }

    public int update(Handle handle) {
        return  JDBCUtil.executeUpdate("update handle set name= ? ,parent_id = ? ,active=?  where id =?",
                handle.getName(),handle.getParentId(),handle.getActive(),handle.getId());
    }




}
