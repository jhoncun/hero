/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Vista.Vista_batalla;
import Modelo.Superheroe;
import Modelo.SuperheroeBO;
import Modelo.SuperheroeDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
        
/**
 *
 * @author JENG-PC
 */
public class controlador implements ActionListener{
    
    private Vista_batalla vista;
    private Superheroe modelo;  
    SuperheroeBO subo = new SuperheroeBO();

    public controlador(Vista_batalla vista, Superheroe modelo) {
        this.vista = vista;
        this.modelo = modelo;
        vista.btn_atacar.addActionListener(this);
        ListarSuperheroe();
        ListarArma();
        
    }
    public void iniciar_vista(){
        vista.setTitle("Batalla de heroes!!!!!!!!!!!!!");
        vista.setLocationRelativeTo(null);  
        vista.setLocation(200, 100);
    }
    public void ListarSuperheroe(){
        try {
           subo.ListarSuperheroe(vista.lst_heroe_ataca);
           subo.ListarSuperheroe(vista.lst_heroe_recibe);
        } catch (SQLException e) {
           System.out.print("No hay heroes registrados"); 
        }
    }
    public void ListarArma(){
        try{
            subo.ListarArma(vista.lst_arma);
        }catch(SQLException e){
            System.out.print("No hay armas registradas");
        }
    }
    public int consultaVidaHeroe(String nom_heroe){
        int vida = 0;
        try {
            vida = subo.consultaVidaHeroe(nom_heroe);
           
        } catch (SQLException e) {
           System.out.print("No hay registro de vidas del heroe");

        }
        return vida;
    }
      public int consultaArmaHeroe(String nom_arma){
        int danno = 0;
        try {
            danno = subo.consultaArmaHeroe(nom_arma);
           
        } catch (SQLException e) {
           System.out.print("No hay registro de vidas del heroe");

        }
        return danno;
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //Nombre,salud y arma   
        int salud_victima = consultaVidaHeroe((String)vista.lst_heroe_recibe.getSelectedItem()); 
        int salud_ataca = consultaVidaHeroe((String)vista.lst_heroe_ataca.getSelectedItem());
        int danno_arma = consultaArmaHeroe((String)vista.lst_arma.getSelectedItem());
       
        if(e.getSource() == vista.btn_atacar){
            String nom_atacante = String.valueOf(vista.lst_heroe_ataca.getSelectedItem());
            String arma_atacante = String.valueOf(vista.lst_arma.getSelectedItem());
            String nom_victima = String.valueOf(vista.lst_heroe_recibe.getSelectedItem());              
                        
            Superheroe victima = new Superheroe(nom_victima,salud_victima,danno_arma);            
            Superheroe atacante = new Superheroe(nom_atacante,salud_ataca,danno_arma);
            vista.lbl_resultado.setText("El resultado es: "+atacante.atacar(victima));  
            
//            
        
        }
        
    }
    
    
    
}
