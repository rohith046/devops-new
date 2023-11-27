package servlethwjj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;
import dto.dto;

@WebServlet("/l")
public class login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		System.out.println(email);
		System.out.println(pass);
		bobDao bd = new bobDao();
		Object o = bd.fetch(email);
		System.out.println(o);

		PrintWriter out = resp.getWriter();
		if (o.equals(pass)) {
			resp.sendRedirect("home.html");

		} else {
			resp.getWriter().print("<h1> <center>EITHER PASSWORD <br>OR<br>EMAIL IS INCORRECT <br>ENTER VALID DATA</center></h1>");
		}

	}
}
