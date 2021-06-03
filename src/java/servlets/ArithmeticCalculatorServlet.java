/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
	*
	* @author 809562
	*/
public class ArithmeticCalculatorServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("result","---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request,response);
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = request.getParameter("first");
        String second= request.getParameter("second");
 
        try {
        if(request.getParameter("add") != null) {
            int plus = Integer.valueOf(first) + Integer.valueOf(second);
            request.setAttribute("result", plus);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
            return; 
        }
       if(request.getParameter("minus") != null) {
            int minus = Integer.valueOf(first) - Integer.valueOf(second);
            request.setAttribute("result", minus);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
            return; 
        }
        if(request.getParameter("multiply") != null) {
            int multiply = Integer.valueOf(first) * Integer.valueOf(second);
            request.setAttribute("result", multiply);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
            return; 
        }
         if(request.getParameter("modulos") != null) {
            int modulos = Integer.valueOf(first) % Integer.valueOf(second);
            
            request.setAttribute("result", modulos);
           
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
               .forward(request, response);
            
            return; 
         }
        }
        catch (NumberFormatException e) {
            request.setAttribute("result", "Invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
            return;
        }
         
    }
    }