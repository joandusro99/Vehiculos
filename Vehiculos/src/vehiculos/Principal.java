/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Estudiantes
 */
public class Principal {
    
    public static void main(String[] args){
        Camion cam = new Camion();
        Moto mot =  new Moto();
        
        System.out.println(mot.acelerar());
        System.out.println(cam.acelerar());
         
        
    }
    
}
