/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spot_fitness.servlet;

import com.mycompany.sport_fitness.doa.CadastroEmpresaDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author heito
 */
@WebServlet(name = "EmpresaServlet", urlPatterns = {"/EmpresaServlet"})
public class EmpresaServlet extends HttpServlet {

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
        
        String cnpj = request.getParameter("cnpj");
        System.out.println(cnpj);
        
        String cei = request.getParameter("cei");
        System.out.println(cei);
        
        String razaoSocial = request.getParameter("razaoSocial");
        System.out.println(razaoSocial);
        
        String nomeFantasia = request.getParameter("nomeFantasia");
        System.out.println(nomeFantasia);
        
        String gerenteResponsavel = request.getParameter("gerenteResponsavel");
        System.out.println(gerenteResponsavel);
        
        String logradouro = request.getParameter("logradouro");
        System.out.println(logradouro);
        
        String numero = request.getParameter("numero");
        System.out.println(numero);
        
        String complemento = request.getParameter("complemento");
        System.out.println(complemento);
        
        String bairro = request.getParameter("bairro");
        System.out.println(bairro);
        
        String cep = request.getParameter("cep");
        System.out.println(cep);
        
        String cidade = request.getParameter("cidade");
        System.out.println(cidade);
        
        String estado = request.getParameter("estado");
        System.out.println(estado);
        
        String telefone = request.getParameter("telefone");
        System.out.println(telefone);
        
        String celular = request.getParameter("celular");
        System.out.println(celular);
        
        String email = request.getParameter("email");
        System.out.println(email);
        
        
        try {
            CadastroEmpresaDAO cadastroEmpresa = new CadastroEmpresaDAO();
            
        } catch (Exception error) {
            System.out.println(error);
        }
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
