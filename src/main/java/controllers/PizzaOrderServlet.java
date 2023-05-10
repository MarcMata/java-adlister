package controllers;

import models.Pizza;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizza.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce-type");
        String toppings = req.getParameter("toppings");
        String address = req.getParameter("address");

        System.out.println(size);
        System.out.println(crust);
        System.out.println(sauce);
        System.out.println(toppings);
        System.out.println(address);

        Pizza customerPizza = new Pizza(size, crust, sauce, toppings, address);

        req.setAttribute("customerPizza", customerPizza);
        req.getRequestDispatcher("pizza.jsp").forward(req, resp);

    }
}
