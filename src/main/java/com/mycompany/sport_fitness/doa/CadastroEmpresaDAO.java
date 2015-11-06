/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sport_fitness.doa;

import com.mycompany.spot_fitness.entidade.CadastroEmpresaBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author uriel
 */
public class CadastroEmpresaDAO extends Conexao{
      
    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;
    public String retorno="erro";

     public String create(CadastroEmpresaBean empresa) {
        String sql = "INSERT INTO Funcionarios(cnpj, cei, razaoSocial, nomeFantasia, gerenteResponsavel, "
                + "logradouro, numero, complemento, bairro, cep, cidade, estado, telefone, "
                + "celular, email) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            
            
            pst.setString(1, empresa.getCnpj());
            pst.setString(2, empresa.getCei());
            pst.setString(3, empresa.getRazaoSocial());
            pst.setString(4, empresa.getNomeFantasia());
            pst.setString(5, empresa.getGerenteResponsavel());
            pst.setString(6, empresa.getLogradouro());
               pst.setInt(7, empresa.getNumero());
            pst.setString(8,  empresa.getComplemento());
            pst.setString(9,  empresa.getBairro());
            pst.setString(10, empresa.getCep());
            pst.setString(11, empresa.getCidade());
            pst.setString(12, empresa.getEstado());
            pst.setString(13, empresa.getTelefone());
            pst.setString(14, empresa.getCelular());
            pst.setString(15, empresa.getEmail());
            

            rs = pst.executeQuery();
            retorno = "sucesso";
            con.close();

        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
        return retorno;
    }
     
     public void read(CadastroEmpresaBean empresa){
     String sql = "INSERT INTO Funcionarios(cnpj, cei, razaoSocial, nomeFantasia, gerenteResponsavel, "
                + "logradouro, numero, complemento, bairro, cep, cidade, estado, telefone, "
                + "celular, email) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
      try {
            con = conexao();
            pst = con.prepareStatement(sql);
            
            
            pst.setString(1, empresa.getCnpj());
            pst.setString(2, empresa.getCei());
            pst.setString(3, empresa.getRazaoSocial());
            pst.setString(4, empresa.getNomeFantasia());
            pst.setString(5, empresa.getGerenteResponsavel());
            pst.setString(6, empresa.getLogradouro());
               pst.setInt(7, empresa.getNumero());
            pst.setString(8,  empresa.getComplemento());
            pst.setString(9,  empresa.getBairro());
            pst.setString(10, empresa.getCep());
            pst.setString(11, empresa.getCidade());
            pst.setString(12, empresa.getEstado());
            pst.setString(13, empresa.getTelefone());
            pst.setString(14, empresa.getCelular());
            pst.setString(15, empresa.getEmail());
            

            rs = pst.executeQuery();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
     }
     
     
     public void update(CadastroEmpresaBean empresa){
     String sql = "UPDATE TABLE Funcionarios(cnpj, cei, razaoSocial, nomeFantasia, gerenteResponsavel, "
                + "logradouro, numero, complemento, bairro, cep, cidade, estado, telefone, "
                + "celular, email) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      try {
            con = conexao();
            pst = con.prepareStatement(sql);
            
            
            pst.setString(1, empresa.getCnpj());
            pst.setString(2, empresa.getCei());
            pst.setString(3, empresa.getRazaoSocial());
            pst.setString(4, empresa.getNomeFantasia());
            pst.setString(5, empresa.getGerenteResponsavel());
            pst.setString(6, empresa.getLogradouro());
               pst.setInt(7, empresa.getNumero());
            pst.setString(8,  empresa.getComplemento());
            pst.setString(9,  empresa.getBairro());
            pst.setString(10, empresa.getCep());
            pst.setString(11, empresa.getCidade());
            pst.setString(12, empresa.getEstado());
            pst.setString(13, empresa.getTelefone());
            pst.setString(14, empresa.getCelular());
            pst.setString(15, empresa.getEmail());
            

            rs = pst.executeQuery();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
     }
     
     
     public void delete(CadastroEmpresaBean empresa){
     String sql = "INSERT INTO Funcionarios(cnpj, cei, razaoSocial, nomeFantasia, gerenteResponsavel, "
                + "logradouro, numero, complemento, bairro, cep, cidade, estado, telefone, "
                + "celular, email) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
     
      try {
            con = conexao();
            pst = con.prepareStatement(sql);
            
            
            pst.setString(1, empresa.getCnpj());
            pst.setString(2, empresa.getCei());
            pst.setString(3, empresa.getRazaoSocial());
            pst.setString(4, empresa.getNomeFantasia());
            pst.setString(5, empresa.getGerenteResponsavel());
            pst.setString(6, empresa.getLogradouro());
               pst.setInt(7, empresa.getNumero());
            pst.setString(8,  empresa.getComplemento());
            pst.setString(9,  empresa.getBairro());
            pst.setString(10, empresa.getCep());
            pst.setString(11, empresa.getCidade());
            pst.setString(12, empresa.getEstado());
            pst.setString(13, empresa.getTelefone());
            pst.setString(14, empresa.getCelular());
            pst.setString(15, empresa.getEmail());
            

            rs = pst.executeQuery();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
     }
     
     
    
}
