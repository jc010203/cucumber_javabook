package nicebank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by juan.hernandez on 11/22/17.
 */
public class AtmServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println(
                "<html>" +
                        "<head><title>Nice Bank ATM</title></head>" +
                        "<body><h1>Welcome to nicebank!</h1></body>" +
                        "</html>"
        );
    }
}
