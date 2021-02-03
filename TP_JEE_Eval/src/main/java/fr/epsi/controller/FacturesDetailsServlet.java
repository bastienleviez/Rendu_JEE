package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.FacturesService;

public class FacturesDetailsServlet extends HttpServlet{
	
	@EJB
	private FacturesService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Long id = Long.parseLong(req.getParameter("id"));
		req.setAttribute("facture", service.get(id));
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/FactureDetails.jsp").forward(req, resp);
	}
	
}
