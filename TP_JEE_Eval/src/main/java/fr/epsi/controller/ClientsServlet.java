package fr.epsi.controller;

import java.io.IOException;
import java.security.Provider.Service;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.service.ClientsService;

public class ClientsServlet extends HttpServlet{
	
	@EJB
	private ClientsService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("clientsliste", service.get());
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/Clients.jsp").forward(req, resp);
	}

}
