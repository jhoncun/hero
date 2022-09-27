/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author JENG-PC
 */
public class SuperheroeDAO {
    
    public void ListarSuperheroe (Connection conn, JComboBox nom_superheroe){
        PreparedStatement pst;
        String tabla = "superheroe";        
        String sql = "select nom_super from " +tabla;
        try {
            pst = conn.prepareStatement(sql);
            ResultSet result = pst.executeQuery();
            while (result.next()) {                
                nom_superheroe.addItem(result.getString("nom_super"));
            }
        } catch (SQLException | NullPointerException e) {
            System.out.println("No se pudo listar el nombre del superheroe");
        }   
    }
    
}
