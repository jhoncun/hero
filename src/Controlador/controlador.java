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
    }
    public void iniciar_vista(){
        vista.setTitle("Batalla de heroes!!!!!!!!!!!!!");
        vista.setLocationRelativeTo(null);  
        vista.setLocation(200, 100);
    }
    public void ListarSuperheroe(){
        try {
           subo.ListarSuperheroe(vista.lst_heroe_ataca);
        } catch (Exception e) {
           System.out.print("No hay heroes registrados"); 
        }
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        //Nombre,salud y arma       
        int salud = 0;
        int daño = 0;
        if(e.getSource() == vista.btn_atacar){
            String nom_atacante = String.valueOf(vista.lst_heroe_ataca.getSelectedItem());
            String arma_atacante = String.valueOf(vista.lst_arma.getSelectedItem());
            String nom_victima = String.valueOf(vista.lst_heroe_recibe.getSelectedItem());              
            /*Hulk
              Hombre Araña
              Iron Man
              Capitan America*/
            switch(nom_victima){
                    case "Hulk":
                        salud = 10;                        
                    break;
                    case "Hombre Araña":
                        salud = 20;
                    break;
                    case "Iron Man":
                        salud = 5;
                    break;
                    case "Capitan America":
                        salud = 9;
                    break;
            }               
            Superheroe victima = new Superheroe(nom_victima,salud,arma_atacante);            
            Superheroe atacante = new Superheroe(nom_atacante,salud,arma_atacante);
            vista.lbl_resultado.setText("El resultado es: "+atacante.atacar(victima));  
            
//            
        
        }
        
    }
    
    
    
}
