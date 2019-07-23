package dao;
import java.util.List;
import entity.User;

public interface Dao {
    public boolean login(String name,String password);
    public boolean register(User user);
    public List<User> getUserAll();
    public boolean delete(String id);
    public boolean update(String name,String sex,String home,String info);
}
