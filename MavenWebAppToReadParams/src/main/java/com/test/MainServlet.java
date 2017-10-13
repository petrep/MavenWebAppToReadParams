package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
/**
 * Servlet implementation class MainServlet
 */
@WebServlet
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MainServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Console log starts..");
		PrintWriter out = response.getWriter();
		out.append("Served at: ").append(request.getContextPath());
		out.append("Received a GET request.");
		out.append("\r");
		
	    Map params = request.getParameterMap();
	    Iterator i = params.keySet().iterator();
	    System.out.println("Params length: " + params.size());
	    out.append("Params length: " + params.size());
	    while ( i.hasNext() )
	      {
	        String key = (String) i.next();
	        String value = ((String[]) params.get( key ))[ 0 ];
	        out.append("params: " + key + " " + value);
	        out.append("\r");
	      }
		
		
		System.out.println("Console log ends..");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		PrintWriter out = response.getWriter();
		out.append("Served at: ").append(request.getContextPath());
		out.append("\r");
		out.append("Received a POST request.");
		out.append("\r");
	}
	
	public void handleRequest(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();
		res.setContentType("text/plain");

		Enumeration<String> parameterNames = req.getParameterNames();

		while (parameterNames.hasMoreElements()) {

			String paramName = parameterNames.nextElement();
			out.write(paramName);
			out.write("n");

			String[] paramValues = req.getParameterValues(paramName);
			for (int i = 0; i < paramValues.length; i++) {
				String paramValue = paramValues[i];
				out.write("t" + paramValue);
				out.write("n");
			}

		}

		out.close();

	}


}
