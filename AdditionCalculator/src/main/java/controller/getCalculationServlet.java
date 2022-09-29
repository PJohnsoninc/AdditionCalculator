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
 * Servlet implementation class getCalculationServlet
 */
@WebServlet("/getCalculationServlet")
public class getCalculationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCalculationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String firstUserNumber = request.getParameter("firstUserNumber");
		String secondUserNumber = request.getParameter("secondUserNumber");			
		ServletContext servletcontext = getServletContext();
		servletcontext.setAttribute("firstUserNumber", firstUserNumber);
		servletcontext.setAttribute("secondUserNumber", secondUserNumber);	
		AdditionCalculator userCalculator = new AdditionCalculator(Integer.parseInt(firstUserNumber), Integer.parseInt(secondUserNumber));
		request.setAttribute("userInput", userCalculator);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
