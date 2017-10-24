package controler;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserDB;
import model.User;

@WebServlet("/UserControler")
public class UserControler extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UserControler() {
        super();     
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("userName");
		String password =  request.getParameter("password");
		User user = new User();
		user.setUserName(userName);
		user.setPassword(password);
		UserDB.insert(user);
		//request.setAttribute("user", user);
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
