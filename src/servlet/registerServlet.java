package servlet;

import dao.DaoImplement;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: liuhao
 * Date: 2019/04/30
 * Time: 19:25
 */
@WebServlet(name = "registerServlet", urlPatterns="/registerServlet")
public class registerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String verifypswd=request.getParameter("verify pswd");
        String sex=request.getParameter("sex");
        String home=request.getParameter("home");
        String info=request.getParameter("info");
        if(!password.equals(verifypswd)){
            request.getRequestDispatcher("verifypswd.jsp").forward(request,response);
        }
        User user=new User(username,password,sex,home,info);
        user.setId(null);
        user.setName(username);
        user.setPwd(password);
        user.setSex(sex);
        user.setHome(home);
        user.setInfo(info);
        DaoImplement ud = new DaoImplement();
        if(ud.register(user)){
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
