/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sport_fitness.doa;

import com.mycompany.spot_fitness.entidade.CadastroFuncionarioBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uriel
 */
public class CadastroFuncionarioDAO extends Conexao{
    
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

     public void create(CadastroFuncionarioBean user) {
        String sql = "INSERT INTO Usuarios(x,x) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            
            //dados pessoais
            pst.setString(1, user.getNome());
            pst.setDate(2, user.getNascimento());
            pst.setObject(3, user.getSexo());
            
            //documentos
            pst.setString(4, user.getRg());
            pst.setString(5, user.getEmissor());
            pst.setDate(6, user.getEmissao());
            pst.setString(7, user.getCpf());
            
            
            //naturalização
            pst.setString(8, user.getPais());
            pst.setString(9, user.getCidade());
            pst.setString(10, user.getEstado());
            
            //endereço
            pst.setString(11, user.getRua());
            pst.setInt(12, user.getNumero());
            pst.setString(13, user.getCep());
            pst.setString(14, user.getComplemento());
            pst.setString(15, user.getTelefone());
            pst.setString(16, user.getCelular());
            

            pst.executeQuery();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
    }
}
