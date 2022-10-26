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
public class Escudo {
    private int id_esc,prot_esc;
    private String nom_esc;

    public Escudo(int id_esc, int prot_esc, String nom_esc) {
        this.id_esc = id_esc;
        this.prot_esc = prot_esc;
        this.nom_esc = nom_esc;
    }

    public int getId_esc() {
        return id_esc;
    }

    public int getProt_esc() {
        return prot_esc;
    }

    public String getNom_esc() {
        return nom_esc;
    }

    public void setId_esc(int id_esc) {
        this.id_esc = id_esc;
    }

    public void setProt_esc(int prot_esc) {
        this.prot_esc = prot_esc;
    }

    public void setNom_esc(String nom_esc) {
        this.nom_esc = nom_esc;
    }
    
    
            
    
}
