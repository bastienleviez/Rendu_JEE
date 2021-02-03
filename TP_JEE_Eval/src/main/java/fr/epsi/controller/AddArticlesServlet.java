package fr.epsi.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.epsi.dto.ArticlesDTO;
import fr.epsi.service.ArticlesService;

public class AddArticlesServlet extends HttpServlet {

	@EJB
	private ArticlesService service;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/AddArticle.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ArticlesDTO articlesDTO = new ArticlesDTO();
		articlesDTO.setNom(req.getParameter("nomArticle"));
		articlesDTO.setPrix(Double.parseDouble(req.getParameter("prixArticle")));
		service.create(articlesDTO);
	}
	
}
