package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet ("/guess")
public class GuessNumberServlet extends HttpServlet {

    public static int randomNumberBetween1and3(){
        int randomNumber = (int)((Math.random()*3)+1);
        System.out.println(randomNumber);
        return randomNumber;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("guess-a-number.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //selects random number and stores it in a variable
        Integer randomNumber = randomNumberBetween1and3();
        String usersNumber = req.getParameter("numbers");
        System.out.println("usersNumber " + usersNumber);
        System.out.println("randomNumber " + randomNumber);

        if (randomNumber.equals(Integer.parseInt(usersNumber))) {
            System.out.println("you win");
            resp.sendRedirect("/correct");
        } else {
            System.out.println("you lose");
            resp.sendRedirect("/incorrect");

        }
    }
}
