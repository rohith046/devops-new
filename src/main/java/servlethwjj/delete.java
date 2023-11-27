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
@WebServlet("/delete")
public class delete extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int uid = Integer.parseInt(id);
		bobDao bd=new bobDao();
		bd.delete(uid);
		List<dto> l=bd.fetchALl();
		req.setAttribute("object", l);
		RequestDispatcher rd = req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
		//Object n = bd.delete(uid);
		/*if(n!=null) {
			resp.getWriter().print("<h1>DATA DELETED</h1>");
		}
		else {
			resp.getWriter().print("<h1>INVALID DATA</h1>");
	
		
		}*/
	}
	
	
	

}
