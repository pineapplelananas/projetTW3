/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.tw3.servlet;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.projet.tw3.model.DAO;
import com.projet.tw3.model.DataSourceFactory;

public class AddEtablissement extends HttpServlet {

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
        try {
            //on importe le DAO
            DAO dao = new DAO(DataSourceFactory.getDataSource());
            
            //on récupère la session en cours si elle existe
            HttpSession session = request.getSession(false);
            
          
            //on récupère les attributs contenus dans le scope request
            String nom_etab = (String) request.getParameter("nom_etab");
            String sigle_etab = (String) request.getParameter("sigle_etab");
            String code_postal_etab = request.getParameter("code_postal_etab");
            String ville_etab = request.getParameter("ville_etab");
            String pays_etab = request.getParameter("pays_etab");
            String fk_id_region = request.getParameter("fk_id_region");
            //si lnom n'est pas indiqué, on renvoie une erreur sur la page
            if (nom_etab.equals("")) {
                throw new Exception("Veuillez indiquer le nom de l'établissement");
            }
            
          int int_fk_id_region = Integer.parseInt(fk_id_region);
            //on ajoute une commande grâce à la méthode du dao
            dao.addEtab(nom_etab, sigle_etab, code_postal_etab, ville_etab,pays_etab,int_fk_id_region);
            //on renvoie vers la servlet CustomerServlet
            response.sendRedirect("customerServlet");

        } catch (Exception ex) {
            Logger.getLogger("AddEtablissementServlet").log(Level.SEVERE, "Action en erreur", ex);
            String customer_id = request.getParameter("customer_id");
            request.setAttribute("customer_id", customer_id);
            request.setAttribute("message", ex.getMessage());
            RequestDispatcher rd = request.getRequestDispatcher("customerServlet");
            rd.forward(request, response);
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

