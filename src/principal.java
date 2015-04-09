
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno05
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<academico> acad = new ArrayList<academico>();
    public static ArrayList<administrativo> admi = new ArrayList<administrativo>();
    
    public static void main(String[] args) {
        
       academico a = new docente (1,30,"joel","perez","LP1","polimorfismo");
       academico b = new coordinador (2,3,"manya","saavedra","LP1","POO"); 
       academico c = new director_academico (3,45,"polo","herrera","DBA","FIA");
       
       
       administrativo d = new gerente (4,3,"edwin","josias","alcantara","DBA");
       administrativo e = new tesorero (6,5,"luis","lavado","gadea","POO"); 
       administrativo f = new contador (6,47,"israel","zurita","camizan","FCE");
       administrativo g = new jefe_area (9,22,"alejandro","herrera","limpieza","FIA");
       
       acad.add(a);
       acad.add(b);
       acad.add(c);
       
       admi.add(d);
       admi.add(e);
       admi.add(f);
       admi.add(g);
       
       
        System.out.println(" TODOS LA PERSONAS DE LA DIRECCION ACADEMICA:");
         
             System.out.println("");
        
        for (academico ac : acad){
             System.out.print(ac.getNombre() + " " + ac.getApelllido() + " -> ");
		      ac.trabajar();
                      ac.administrar();
                      ac.compartir();
                      ac.puntualidad();
                      
                        System.out.println(""); 
                        
         }
       
         System.out.println(" TODOS LA PERSONAS DE LA DIRECCION ADMINISTRATIVA:");
         System.out.println("");
         for (administrativo ad : admi){
             System.out.print(ad.getNombre() + " " + ad.getApelllido() + " -> ");
		      ad.trabajar();
                      ad.administrar();
                      ad.compartir();
                      ad.puntualidad();
                      
                    System.out.println(""); 
        
         }
    }
    
}
