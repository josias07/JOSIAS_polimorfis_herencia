/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class gerente extends administrativo{

    public gerente(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    @Override
    public void trabajar() {
        System.out.println(" trabajo como gerente (Clase gerente)");
     }

    @Override
    public void puntualidad() {
        System.out.println(" siempre llego temprano (Clase gerente)");
     }

    @Override
    public void administrar() {
         System.out.println(" se administrar bien (Clase gerente)");
    }

    @Override
    public void compartir() {
         System.out.println(" comparto copnocimiento(Clase gerente)");
     }
    
}
