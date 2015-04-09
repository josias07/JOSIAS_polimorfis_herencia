/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class docente extends academico{

    public docente(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    

    @Override
    public void trabajar() {
         System.out.println(" trabajo enseñando a mis alumnos(Clase docente)");
     }

    @Override
    public void puntualidad() {
        System.out.println(" siempre llego temprano a clases(Clase docente)");
    }

    @Override
    public void administrar() {
        System.out.println(" se administrar mi tiempo(Clase docente)");
    }

    @Override
    public void compartir() {
        System.out.println(" comparto con mis alumnos(Clase docente)");
    }
    
}
