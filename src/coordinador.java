/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class coordinador extends academico{

    public coordinador(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }


    @Override
    public void trabajar() {
        System.out.println(" soy coordinador(Clase coordinador)");
    }

    @Override
    public void puntualidad() {
         System.out.println("soy puntual (Clase coordinador)");
    }

    @Override
    public void administrar() {
         System.out.println("administro bien (Clase coordinador)");
    }

    @Override
    public void compartir() {
         System.out.println("me gusta compartir (Clase coordinador)");
     }
    
}
