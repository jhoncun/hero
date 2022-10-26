/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author JENG-PC
 */
public class Partida {
   private int id_partida;
   private Date partida;
   private int val_resutado;

    public Partida(int id_partida, Date partida, int val_resutado,Superheroe atacante,Superheroe victima) {
        this.id_partida = id_partida;
        this.partida = partida;
        this.val_resutado = val_resutado;
    }

    public int getId_partida() {
        return id_partida;
    }

    public Date getPartida() {
        return partida;
    }

    public int getVal_resutado() {
        return val_resutado;
    }
   
    
    
    
}
