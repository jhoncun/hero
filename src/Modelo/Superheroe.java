/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author JENG-PC
 */
public class Superheroe {
       private String nombre;
       private int salud;     
       private String arma;

    public Superheroe(String nombre, int salud,String arma) {
        this.nombre = nombre;
        this.salud = salud;        
        this.arma = arma;
    }

    public Superheroe() {
    }
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }  
    
       
    public String atacar(Superheroe victima){
            int daño = 0;     
            int res;
            String msg;
           /*
            Hacha
            Escudo
            Laser
            Puño*/            
            switch(this.arma){
                    case "Hacha":
                        daño = 40;                        
                    break;
                    case "Escudo":
                        daño = 30;                        
                    break;
                     case "Laser":
                        daño = 20;                        
                    break;
                     case "Puño":
                        daño = 5;                        
                    break; 
            
            }            
        res = victima.salud - daño;      
        if(res <=0){
            msg = "El atacante gano!";
        }else{
            msg = "La victima gano!";
        }
        return msg;
    } 
             
    
    
}
