package realLogin.com.onisim;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")

public class Login extends HttpServlet {

	Dao dao = new Dao();

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("username");
		String pass = request.getParameter("password");

		try {
			if (dao.login(user, pass)) {

				response.sendRedirect("hello.jsp");

			}

			else {

				response.sendRedirect("login.jsp");

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		HttpSession httpSession = request.getSession();

		httpSession.setAttribute("username", user);

	}

	// protected void doPost(HttpServletRequest request, HttpServletResponse
	// response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	// doGet(request, response);
	// }

}
