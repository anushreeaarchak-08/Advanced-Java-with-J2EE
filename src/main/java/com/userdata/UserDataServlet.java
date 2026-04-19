package com.userdata;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");
        String error = "";
        if(username == null || username.isEmpty())
            error += "Username is required!<br>";
        if(email == null || !email.contains("@"))
            error += "Valid Email is required!<br>";
        if(designation == null || designation.isEmpty())
            error += "Designation is required!<br>";
        if(!error.isEmpty()) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>" + error + "</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
            out.println("</body></html>");
            return;
        }
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}