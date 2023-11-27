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
@WebServlet("/pop")
public class fetchall extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	
	bobDao bd =new bobDao();
	 List<dto> n = bd.fetchALl();
	 resp.getWriter().print(n);
	 req.setAttribute("o",n);
	 RequestDispatcher rd = req.getRequestDispatcher("FetchAll.jsp");
	 rd.forward(req, resp);
	 
	 
	}
}
