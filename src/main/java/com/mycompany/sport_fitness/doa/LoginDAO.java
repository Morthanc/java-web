/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sport_fitness.doa;

/**
 *
 * @author heito
 */
import com.mycompany.spot_fitness.entidade.LoginBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO extends Conexao {

    private Connection con = null;
    private ResultSet rs = null;
    private PreparedStatement pst = null;

    public void cadastrarLogin(LoginBean user) {
        String sql = "insert into Usuarios(nameUser,pasUser) value(?,?)";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNameUser());
            pst.setString(2, user.getPasUser());

            pst.executeQuery();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
    }

    public boolean selecionarLogin(String nameUser, String pasUser) {
        String sql = "select from Usuarios where nameUser = ? and pasUser = ?";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, nameUser);
            pst.setString(2, pasUser);
            pst.executeQuery();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
        return false;
    }
}
