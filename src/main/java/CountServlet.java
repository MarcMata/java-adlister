import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {

    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String reset = req.getParameter("reset");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String resetConfirmed = "reset";
        if(Objects.equals(reset, resetConfirmed)) {
            out.println("<h3>Count reset!</h3>");
            out.println("<button><a href='/count'>Back to count</a></button>");
            count = 0;

        } else {
            count++;
            out.println("<h3>The count is " + count + "!</h3>");
        }
        }
    }