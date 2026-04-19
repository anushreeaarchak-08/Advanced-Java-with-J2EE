package com.studentmarks;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String rollno = request.getParameter("rollno");
        String sname = request.getParameter("sname");
        int s1 = Integer.parseInt(request.getParameter("s1"));
        int s2 = Integer.parseInt(request.getParameter("s2"));
        int s3 = Integer.parseInt(request.getParameter("s3"));
        int s4 = Integer.parseInt(request.getParameter("s4"));
        int s5 = Integer.parseInt(request.getParameter("s5"));
        String error = "";
        if(rollno == null || rollno.isEmpty())
            error += "Roll No is required!<br>";
        if(sname == null || sname.isEmpty())
            error += "Student Name is required!<br>";
        if(!error.isEmpty()) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h2 style='color:red;'>" + error + "</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
            out.println("</body></html>");
            return;
        }
        double average = (s1+s2+s3+s4+s5) / 5.0;
        String result = (s1>=40 && s2>=40 && s3>=40 && s4>=40 && s5>=40)
                        ? "Pass" : "Fail";
        request.setAttribute("rollno", rollno);
        request.setAttribute("sname", sname);
        request.setAttribute("s1", s1);
        request.setAttribute("s2", s2);
        request.setAttribute("s3", s3);
        request.setAttribute("s4", s4);
        request.setAttribute("s5", s5);
        request.setAttribute("average", average);
        request.setAttribute("result", result);
        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}