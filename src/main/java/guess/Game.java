package guess;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/game")
public class Game  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String number = req.getParameter("number");
		int a = Integer.parseInt(number);

		
	
			
		
			int min=1;
			int max=10;
		
			int b = (int)(Math.random()*(max-min+1)+min);
//			System.out.println(b);
			String result;
			if(a==b) {
				PrintWriter out = resp.getWriter();
				out.println(" <h1>WINNER </h1>");
			}
			else {
				PrintWriter out = resp.getWriter();
				out.println(" <h1>LOSSER </h1>");
			}
			
			
			
//			req.setAttribute("result", result);
//	        req.setAttribute("randomNumber", b);
//
//	        RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
//	        dispatcher.forward(req, resp);
//			
//			
			
		
		
	}
		
	}



