/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class jefe_area extends administrativo{

    public jefe_area(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    @Override
    public void trabajar() {
         System.out.println(" trabajo en el area educativa (Clase jefe_area)");
     }

    @Override
    public void puntualidad() {
        
        System.out.println(" llegue a la hora (Clase jefe_area)");
     }

    @Override
    public void administrar() {
        
        System.out.println(" administro bien mi gente (Clase jefe_area)");
     }

    @Override
    public void compartir() {
        
        System.out.println(" comparto trabajo (Clase jefe_area)");
    }
    
}
