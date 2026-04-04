package br.com.entendendo.demo;

import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected  void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        request.setAttribute("nomeUsuario", nome);

        RequestDispatcher dispatcher = request.getRequestDispatcher("saudacao.jsp");
        dispatcher.forward(request, response);
    }
}