/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.EstadoSesion;
import Modelo.ModelUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Pedro Moretto
 */

public class IniciarSesion extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        HttpSession objSesion = null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String nickname = request.getParameter("idNick");
        String password = request.getParameter("idPass");
        
        EstadoSesion nuevoEstado;
        RequestDispatcher dispatcher = null;
        
        try {
            boolean usr = ModelUsuario.getInstance().autenticarCliente(nickname, password);    
            out.print(usr);
            if(!usr){
                nuevoEstado = EstadoSesion.LOGIN_INCORRECTO;
                dispatcher = request.getRequestDispatcher("errorVisitante.jsp");
            } else {
                dispatcher = request.getRequestDispatcher("inicioCliente.jsp");
                nuevoEstado = EstadoSesion.LOGIN_CORRECTO;
                request.getSession().setAttribute("usuario_logueado", nickname);
            }
        } catch(Exception ex){
        nuevoEstado = EstadoSesion.LOGIN_INCORRECTO;
        }
        request.getSession().setAttribute("estado_sesion", nuevoEstado);
        dispatcher.forward(request, response);

            
        } finally {
            
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
