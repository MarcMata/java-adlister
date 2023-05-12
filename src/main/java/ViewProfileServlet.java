import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Objects;

@WebServlet(name = "ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = (String) session.getAttribute("user");
//        Boolean isLoggedIn = session.getAttribute("isLoggedIn") != null;
        if (user == null){
            response.sendRedirect("/login");
        } else {
//            request.setAttribute("user", user); <-- don't need this extra setAttribute
            request.getRequestDispatcher("/profile.jsp").forward(request, response);
        }
    }
}