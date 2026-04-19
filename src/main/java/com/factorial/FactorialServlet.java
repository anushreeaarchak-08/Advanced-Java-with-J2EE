package com.factorial;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num = Integer.parseInt(request.getParameter("num"));
        long factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }
        out.println("<html><body>");
        out.println("<h2>Factorial of " + num + " is: " + factorial + "</h2>");
        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}