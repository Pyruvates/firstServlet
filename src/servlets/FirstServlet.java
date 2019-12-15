package servlets;
/*
 * Creating by Koshkarov Vitaliy on 11.12.2019
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  }

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String name = request.getParameter("name");
    String lastName = request.getParameter("lastName");

    PrintWriter writer = response.getWriter();

    writer.println("<html>");
    writer.println("<h2> Hello, " + name + " " + lastName + "! </h2>");
    writer.println("</html>");
  }
}
