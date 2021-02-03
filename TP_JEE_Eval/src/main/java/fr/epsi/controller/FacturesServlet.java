package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.FacturesService;

public class FacturesServlet extends HttpServlet {

	@EJB
	private FacturesService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("facturesliste", service.get());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Factures.jsp").forward(req, resp);
	}
}
