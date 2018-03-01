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
public class Motor {
    private String numeroserie;
    private int cilindros;
    
    public Motor(){
        
    }

    public String getNumeroserie() {
        return numeroserie;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setNumeroserie(String numeroserie) {
        this.numeroserie = numeroserie;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }
    
}
