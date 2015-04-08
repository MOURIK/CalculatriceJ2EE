package com.occalculatrice.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculatrice
 */
@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sterme1 = (String)request.getParameter("terme1");
		String sterme2 = (String)request.getParameter("terme2");
		
		if (sterme1.isEmpty() || sterme2.isEmpty()) {
			request.setAttribute("erreur", "Vous devez remplir les deux champs.");
			// Redirection vers le formulaire form.jsp
			this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
		}
			// Sinon
		else {
			double terme1 = Double.parseDouble(sterme1);
			double terme2 = Double.parseDouble(sterme2);
			double som = terme1 + terme2;
			request.setAttribute("resultat", som);
			// Redirection vers la page hello.jsp
			this.getServletContext().getRequestDispatcher("/WEB-INF/calculatrice.jsp").forward(request, response);
		}
		
	}

}
