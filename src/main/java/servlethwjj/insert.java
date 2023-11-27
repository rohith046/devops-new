package servlethwjj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;
import dto.dto;
@WebServlet("/i")
public class insert extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String name = req.getParameter("name");
	String id = req.getParameter("id");
	String pass = req.getParameter("pass");

	System.out.println("the name is -->" + name);
	System.out.println("the email is-->" + id);
	System.out.println("the password is-->" + pass);

	dto b = new dto();
	b.setName(name);
	b.setEmail(id);
	b.setPassword(pass);
	System.out.println(b);
	bobDao bd = new bobDao();
	bd.insert(b);
	resp.sendRedirect("Login.html");
}
}
