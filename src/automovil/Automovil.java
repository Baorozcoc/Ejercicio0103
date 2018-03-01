/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automovil;

/**
 *
 * @author Estudiante
 */
public class Automovil {
    private String marca;
    private int annio;
    private String modelo;
    
    public Automovil(){
        
    }

    public String getMarca() {
        return marca;
    }

    public int getAnnio() {
        return annio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
