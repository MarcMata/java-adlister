import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet",urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if(name != null) {
            out.println("<h3>Ayyy! Hello, " + name + "!</h3>");
        } else {
            out.println("<h3>Tell me your name!</h3>");
        }
    }
}
