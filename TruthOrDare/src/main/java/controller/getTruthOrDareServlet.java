package controller;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TruthOrDare;

/**
 * Servlet implementation class getTruthOrDareServlet
 */
@WebServlet("/getTruthOrDareServlet")
public class getTruthOrDareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTruthOrDareServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userInput = request.getParameter("userInput");
		
		TruthOrDare userChoice = new TruthOrDare(userInput);
//		PrintWriter writer = response.getWriter();
//		writer.println(userChoice.setChoice(userInput));
//		writer.close();
		
		request.setAttribute("game", userChoice);
		request.setAttribute("userInput", userInput);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);

	}

}
