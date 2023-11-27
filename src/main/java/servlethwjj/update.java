package servlethwjj;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;
import dto.dto;
@WebServlet("/jsp")
public class update extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	int uid = Integer.parseInt(id);
	bobDao bd=new bobDao();
	bd.update(uid, name);
	List<dto> n=bd.fetchALl();
	req.setAttribute("object", n);
	RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
	rd.forward(req, resp);
	}

}
