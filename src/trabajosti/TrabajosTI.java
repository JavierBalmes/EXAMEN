/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajosti;

/**
 *
 * @author Elias
 * @
 */
public class TrabajosTI {
    private static String nombre;
    private static String descripcion;
    private static String habilidades;
    private static int experiencia;
    private static String nivel;
    

    public TrabajosTI( String nombre, String descripcion,String habilidades, int experiencia, String nivel){
        TrabajosTI.experiencia = experiencia;
        TrabajosTI.nivel = nivel;
        TrabajosTI.descripcion = descripcion;
        TrabajosTI.habilidades = habilidades;
        TrabajosTI.nombre = nombre;
       } 
        
    public static int salario(){
        int salario = 0;
        if(nivel.equalsIgnoreCase("Jr")){
            salario = 1000* (1+(experiencia/10));
        } else if(nivel.equalsIgnoreCase("Sr")){
            salario = 1500* (1+(experiencia/10));
        } else if(nivel.equalsIgnoreCase("Leader")){
            salario = 2000* (1+(experiencia/10));
        } else if(nivel.equalsIgnoreCase("Boss")){
            salario = 2500* (1+(experiencia/10));
        }
         return salario;
    }

    public static void main(String[] args) {
       
        TrabajosTI trabajos = new TrabajosTI("developer", "desarrollo de aplicaciones", "programacion web", 3, "Jr");
        System.out.println("El "+ nombre +" que trabaja en " + descripcion +" con especialidad en " + habilidades +" tiene una salario de " + salario());
       
        
               
  
   

        
    }
}   

