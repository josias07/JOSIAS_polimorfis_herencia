/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public abstract class academico implements  persona {

        int edad, dni;
        String nombre, apelllido,sexo, especialidad;

    public academico(int edad, int dni, String nombre, String apelllido, String sexo, String especialidad) {
        this.edad = edad;
        this.dni = dni;
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.sexo = sexo;
        this.especialidad = especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelllido() {
        return apelllido;
    }

    public void setApelllido(String apelllido) {
        this.apelllido = apelllido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
    public  void compartir(){
        System.out.println("comparte (Clase Padre)");
        
    }

    
    public  void administrar(){
        System.out.println("administra (Clase Padre)");
        
    }

    
    public  void puntualidad(){
        System.out.println("puntual (Clase Padre)");
        
    }

    
    public void trabajar(){
        System.out.println("trabaja (Clase Padre)");
        
    }

   
}
