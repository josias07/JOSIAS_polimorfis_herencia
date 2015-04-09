/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class director_academico extends academico {

    public director_academico(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    @Override
    public void trabajar() {
        System.out.println(" trabajo como director(Clase director_academico)");
     }

    @Override
    public void puntualidad() {
        System.out.println("todos lo dias llego a la hora (Clase director_academico)");
     }

    @Override
    public void administrar() {
        System.out.println(" se administrar mis areas (Clase director_academico)");
     }

    @Override
    public void compartir() {
        System.out.println(" comparto con mis subditos(Clase director_academico)");
    }
    
}
