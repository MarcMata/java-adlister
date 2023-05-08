import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String car = req.getParameter("car");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if(car != null) {
            out.println("<h3>Your " + car + " is awesome!</h3>");
        } else {
            out.println("<h3>Tell me about your car!</h3>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("username");
        String phoneNumber = req.getParameter("phone");
        String address = req.getParameter("address");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        resp.setContentType("text/html");
        PrintWriter  out = resp.getWriter();
        out.println("<h2>Welcome, " + firstName + ' ' + lastName + "! Account created successfully</h1>");
        out.println("<h3>Username: " + userName + "</h3>");
        out.println("<h3>Phone Number: " + phoneNumber + "</h3>");
        out.println("<h3>Address: " + address + ", " + city + ", " + state + " " + zip + "</h3>");
        out.println("<h3>Thank you for signing up!</h3>");

    }
}