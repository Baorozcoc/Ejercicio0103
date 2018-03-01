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
public class Llanta {
    private String marca;
    private String modelo;
    private int tamanniopulgadas;
    
    public Llanta(){
        
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getTamanniopulgadas() {
        return tamanniopulgadas;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTamanniopulgadas(int tamanniopulgadas) {
        this.tamanniopulgadas = tamanniopulgadas;
    }
    
}
