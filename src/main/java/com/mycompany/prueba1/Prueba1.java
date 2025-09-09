/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba1;

/**
 *
 * @author Santo Tomas
 */
public class Prueba1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        String mensaje = "Este es un mensaje";
        System.out.println(mensaje);
        
         
    Usuario user1 = new Usuario("Jonathan", "Fuentealba", (byte)35, false, "Chilena"); 
    Usuario user2 = new Usuario("Marcelo", "Concha", (byte)25, true, "Chilena"); 
    Usuario user3 = new Usuario("Juan", "Castolo", (byte)40, false, "Haitiana"); 
    Usuario user4 = new Usuario("Marco", "Aurelio", (byte)19, true, "Griega"); 
    Usuario user5 = new Usuario("Javiera", "Mena", (byte)24, false, "Chilena"); 
    
    System.out.println(user1.toString());
    System.out.println(user2.toString());
    user2.setNombre("Ramiro");
    System.out.println(user2.toString());
    
    Alumno alumno = new Alumno(6, 3, 5, "Jonathan", "Fuentealba", (byte)35, true, "Aleman");
    alumno.saludar();
       
    }
    
    //instanciar o invocar
    //Usuario user1 = new Usuario();
   
         
            
  }
