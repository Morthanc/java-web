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

    public void create(LoginBean user) {
        String sql = "insert into Usuarios(nameUser,pasUser) value(?,?)";

        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, user.getNameUser());
            pst.setString(2, user.getPasUser());

            pst.executeQuery();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
    }
    
    public void update(String nameUser, String pasUser){
        String sql = "update Usuario set pasUser = ? where nameUser = ?";
        
        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setString(1, pasUser);
            pst.setString(2, nameUser);
            
            pst.executeUpdate();
            con.close();
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
    }
    
    public void delete(int codUser){
        String sql = "delete from Usuario where codUser = ?";
        
        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            pst.setInt(1, codUser);
            
            pst.executeUpdate();
            con.close();
        } catch (SQLException | ClassNotFoundException e) {
        }
        
    }

    public boolean read(String nameUser, String pasUser) {
        String sql = "select * from Usuarios";
        try {
            con = conexao();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String user = rs.getString("nameUser");
                System.out.println(user);
                if (nameUser.equals(user)) {
                    String password = rs.getString("pasUser");
                    System.out.println(password);
                    if (pasUser.equals(password)) {
                        con.close();
                        return true;
                    } else {
                        System.out.println("Senha incorreta");
                    }
                } else {
                    System.out.println("Usuário não cadastrado");
                }
            }
        } catch (SQLException | ClassNotFoundException error) {
            System.out.println(error);
        }
        return false;
    }
}
