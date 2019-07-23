package dao;
import entity.User;
import util.DBop;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class DaoImplement implements Dao {
    public boolean login(String name,String password){
        boolean flag=false;
        try {
            try {
                DBop.init();
            } catch (Exception e) {
                e.printStackTrace();
            }
            ResultSet resultset=DBop.mysqlquery("select * from user where name='"+name+"'and pwd='"+password+"';");
            while(resultset.next()){
                if(resultset.getString("name").equals(name)&&resultset.getString("pwd").equals(password)){
                    flag=true;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return flag;
    }
    public boolean register(User user){
        boolean flag=false;
        try{
            try{
                DBop.init();
            }catch(Exception e){
                e.printStackTrace();
            }
            int a=DBop.mysqlUpdate("insert into user (id,name,pwd,sex,home,info) " +
                    "values ("+user.getId()+",'"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"','"+user.getHome()+"','"+user.getInfo()+"');");
            if(a>0){
                flag=true;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        DBop.connectClose();
        return flag;
    }
    public boolean delete(String id){
        boolean flag=false;
        return flag;
    }
    public boolean update(String name,String sex,String home,String info){
        boolean flag=false;
        return flag;
    }
    public List<User> getUserAll(){
        List<User> list=new ArrayList<>();
        return list;
    }
}
