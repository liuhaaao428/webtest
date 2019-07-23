package servlet;

import dao.DaoImplement;

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
@WebServlet(name = "loginServlet",urlPatterns = "/loginServlet")
public class loginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html");
    String username = request.getParameter("username");
    String password = request.getParameter("password");
        DaoImplement di =new DaoImplement();
        if(di.login(username,password)){
        request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.doPost(request,response);
    }
}
