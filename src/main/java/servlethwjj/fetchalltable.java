package servlethwjj;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.bobDao;
import dto.dto;

public class fetchalltable extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	bobDao bd =new bobDao();
	List<dto> k = bd.fetchALl();
		req.setAttribute("object",k);
	
		
	}

}
