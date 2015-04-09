/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class contador extends administrativo{

    public contador(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    @Override
    public void trabajar() {
         System.out.println(" trabajo como contador (Clase contador)");
    }

    @Override
    public void puntualidad() {
        System.out.println(" a veces llego tarde(Clase contador)");
     }

    @Override
    public void administrar() {
        System.out.println(" se adnistrar bien la empresa(Clase contador)");
     }

    @Override
    public void compartir() {
        System.out.println("lo que se comparto (Clase contador)");
    }
    
}
