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
 * @author heito
 */
public class CadastroFuncionarioDAO extends Conexao {

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public void create(CadastroFuncionarioBean funcionario) {
        String sql = "insert into Funcionarios() value(?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, funcionario.getNome());
            pst.setDate(2, funcionario.getNascimento());
            pst.setString(3,""+funcionario.getSexo());
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
    }
}
