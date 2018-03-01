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
    
    private Llanta[] llantas;
    private Puerta[] puertas;
    private Motor motor;
    
    public Automovil(){
        this.llantas= new Llanta[4];
        this.puertas= new Puerta[4];
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
    
    public Motor getMotor(){
        return this.motor;
    }
    public boolean replaceMotor(Motor motor){
        this.motor = motor;
        return false;
    }
    public Llanta[] getLlantas(){
        return this.llantas;
    }
    public boolean addLlanta (Llanta llanta){
        //
        return false;
    }
    public boolean removeLlanta (Llanta llanta){
        return false;
    } 
    
    public boolean replaceLlanta (Llanta llanta, Llanta nueva){
        //buscar y cambiar
        return false;
    }
}
