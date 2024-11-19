
package co.edu.educ.s2.taller3.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Coche {
 
  static int ContadorCoches = 0;
  
   String Marca;
   String Modelo;

   public Coche (String Marca, String modelo) {
       
      this.Marca = Marca; 
      this.Modelo = Modelo;
       
      ContadorCoches++; 
       
   }
   public static void mostrarContador(){
       
       System.out.println("generar" + ContadorCoches+ "coches");
       
       
       
   }
   
   
   
   
}

