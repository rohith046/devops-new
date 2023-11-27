package servlethwjj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;

@WebServlet("/fetch")
public class fetch extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		// String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		bobDao bd = new bobDao();

		Object n = bd.fetch(email);
		if (n != null) {
			resp.getWriter().print(n);
		} else {
			resp.getWriter().print("invalid data");
		}
	}
}
