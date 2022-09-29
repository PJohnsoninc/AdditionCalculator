package controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AdditionCalculator;

/**
 * Servlet implementation class getTotalServlet
 */
@WebServlet("/getTotalServlet")
public class getTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTotalServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext servletcontext = getServletContext();
		String firstUserNumber = (String)servletcontext.getAttribute("firstUserNumber");
		String secondUserNumber = (String)servletcontext.getAttribute("secondUserNumber");
		String thirdUserNumber = request.getParameter("thirdUserNumber");		
		AdditionCalculator userTotalCalculator = new AdditionCalculator(Integer.parseInt(firstUserNumber), Integer.parseInt(secondUserNumber), Integer.parseInt(thirdUserNumber));
		request.setAttribute("userTotalInput", userTotalCalculator);
		getServletContext().getRequestDispatcher("/totalResult.jsp").forward(request, response);
			
	}

}
