/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gerson Risso
 */
import modelo.Calculo;

public class Controle extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {

                RequestDispatcher rd = request.getRequestDispatcher("exibir.jsp");
                String flag = request.getParameter("flag");
                if (flag.equals("quad")) {
                    float lado = Float.parseFloat(request.getParameter("lado"));
                    float r = Calculo.calcArea(lado);
                    request.setAttribute("resultado", r);
                    rd.forward(request, response);
                } else if (flag.equals("ret")) {
                    float larg = Float.parseFloat(request.getParameter("larg"));
                    float comp = Float.parseFloat(request.getParameter("comp"));
                    float r = Calculo.calcArea(larg, comp);
                    request.setAttribute("resultado", r);
                    rd.forward(request, response);
                } else if (flag.equals("cubo")) {
                    float cubo = Float.parseFloat(request.getParameter("lado"));
                    float r = Calculo.calcArea2(cubo);
                    request.setAttribute("resultado", r);
                    rd.forward(request, response);
                } else if (flag.equals("triangulo")) {
                    float base = Float.parseFloat(request.getParameter("base"));
                    float altura = Float.parseFloat(request.getParameter("altura"));
                    float r = Calculo.calcArea2(base, altura);
                    request.setAttribute("resultado", r);
                    rd.forward(request, response);
                }
            } catch (IllegalArgumentException e) {
                out.print(e.getMessage());
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
