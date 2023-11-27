package servlethwjj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;

@WebServlet("/deleteall")
public class deleteall extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		bobDao bd = new bobDao();
		resp.getWriter().print(bd.deleteAll() );
	}

}
