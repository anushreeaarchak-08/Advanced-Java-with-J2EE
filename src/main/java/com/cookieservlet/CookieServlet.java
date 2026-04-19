package com.cookieservlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    int count = 0;

    public void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String userName = request.getParameter("userName");
        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(30);
            response.addCookie(userCookie);
        }
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                    break;
                }
            }
        }
        out.println("<html><body>");
        if (existingUser != null) {
            count += 1;
            out.println("<font color=blue><h2>Welcome back, "
                    + existingUser + "!</h2></font>");
            out.println("<font color=magenta><h2>You have visited this page "
                    + count + " times!</h2></font>");
            out.println("<h3>List of Cookies:</h3>");
            if(cookies != null) {
                for(Cookie c : cookies) {
                    out.println("<p>Cookie Name: " + c.getName()
                            + " | Value: " + c.getValue() + "</p>");
                }
            }
            out.println("<br><a href='index.html'>Go Back</a>");
        } else {
            out.println("<h2 style='color:red;'>Cookie Expired!</h2>");
            out.println("<a href='index.html'>Login Again</a>");
        }
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);
        response.sendRedirect("CookieServlet");
    }
}