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
       private int danno;
       private int proteccion;

    public Superheroe(String nombre, int salud,int danno, int proteccion) {
        this.nombre = nombre;
        this.salud = salud;        
        this.danno = danno;
        this.proteccion = proteccion;
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

    public int getDanno() {
        return danno;
    }

    public int getProteccion() {
        return proteccion;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }

    public void setProteccion(int proteccion) {
        this.proteccion = proteccion;
    }  
    
       
    public String atacar(Superheroe victima){          
            int res;
            String msg;                    
            
        res = victima.salud  ;      
        if(res <=0){
            msg = "El atacante gano!";
        }else{
            msg = "La victima gano!";
        }
        return msg;
    } 
             
    
    
}
