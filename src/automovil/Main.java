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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor= new Motor();
        motor.setNumeroserie("123");
        Llanta ll= new Llanta();
        ll.setModelo("12");
        Puerta puerta= new Puerta();
        Automovil auto= new Automovil();
        auto.addPuerta(puerta);
        auto.addLlanta(ll);
        auto.replaceMotor(motor);
        auto.setMarca("bbb");
        auto.setModelo("abc");
        
        
    }
    
}
