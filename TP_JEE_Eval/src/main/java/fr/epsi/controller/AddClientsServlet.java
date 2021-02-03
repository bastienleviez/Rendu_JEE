package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ClientsDTO;
import fr.epsi.service.ClientsService;

public class AddClientsServlet extends HttpServlet{
	
	@EJB
	private ClientsService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AddClient.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ClientsDTO clientsDTO = new ClientsDTO();
		clientsDTO.setNom(req.getParameter("nomClient"));
		clientsDTO.setAdresse(req.getParameter("adresseClient"));
		service.create(clientsDTO);
	}

}
