/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

/**
 *
 * @author SmartUrban2025
 */
public class E3_Especialidad {
    transient static final long serialVersionUID=2L;
    private String nomesp;
    
    public void MostrarEsp(){
        System.out.println("Especialidad   : "      +this.nomesp);
    }

    public String getNomesp() {
        return nomesp;
    }

    public void setNomesp(String nomesp) {
        this.nomesp = nomesp;
    }
}