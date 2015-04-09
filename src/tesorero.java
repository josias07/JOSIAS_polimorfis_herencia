/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class tesorero extends administrativo{

    public tesorero(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        super(edad, dni, nombre, apelllido, sexo, especialidad);
    }

    @Override
    public void trabajar() {
        System.out.println(" estoy trabajando entesereria (Clase tesorero)");
        
        }

    @Override
    public void puntualidad() {
        
         System.out.println(" llegue puntual  (Clase tesorero)");
     }

    @Override
    public void administrar() {
        
         System.out.println(" administro bien la plata (Clase tesorero)");
    }

    @Override
    public void compartir() {
        
         System.out.println(" comparto con los demas (Clase tesorero)");
     }
    
}
