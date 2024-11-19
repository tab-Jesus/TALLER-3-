
package co.edu.educ.s2.taller3.Docs;

/**
 *
 * @author JESUS DAVID
 */
public class Matematicas {
    
    public static int suma (int a, int b){
        return a + b;

    }
    
    public static int resta (int a, int b){
        
       return a - b ; 
 
    }
    
    public static int multiplicacion (int a, int b){
        
      return a * b ;
    }
    
    public class Calculadora{
        
        public static void main (String[] args){
            
            System.out.println("suma"+Matematicas.suma(5, 7));
            System.out.println("resta"+Matematicas.resta(5, 7));
            System.out.println("multiplicacion"+Matematicas.multiplicacion(5, 7));    
            
            
        }
        
        
    }
        
        
    
    
    
        
        
    
    
}
