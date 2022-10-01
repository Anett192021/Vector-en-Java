/**
 *
 * @author annet
 */

/**
 * //Con este programa vamos a determinar cuántos números tres hay en un vector de diez números. 
 */
package vector;

/**
 * //Vamos a importar la clase Util.Scanner de Java para leer los números. 
 */

import java.util.Scanner; 

/**
 * //Luego declaramos la clase Publica Vector. 
 */

public class Vector {

/**
 * Ahora vamos a crear una clase Main para poder correrlo
*/     
    public static void main(String[] args) {

/**
 * Luego vamos a crear un vector de diez posiciones de números enteros.
*/ 
    int vector [] = new int [10];
    Scanner teclado = new Scanner (System.in);
    
/**
 * Ahora vamos a cargar nuestro vector.
*/
    
    for (int i = 0; i<10; i++) {
        System.out.println("Ingrese un número para el vector");
        vector[i] = teclado.nextInt();
    }
        
/**
 * Ahora vamos a recorrer el vector y contar cuántos números 3 hay 
*/  
    
        int cont = 0;
        
        for (int i = 0; i<10; i++) {
            
            if(vector[i] == 3)  {
                cont = cont +1;
            }
        }
       
/**
 * Luego mostramos cuántos números 3 hay 
*/          
        System.out.println("La cantidad de números 3 que hay en el vector es: " + cont);
        
        
    }
    
}
