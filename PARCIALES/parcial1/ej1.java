/*Haga un ejemplo en código fuente Java donde genere un arreglo de 8 elementos, 
los valores del arreglo los introduzca el usuario por consola y 
luego imprima todos los valores del arreglo usando la sentencia for each.*/

package parcial1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int[] array = new int[8];
        
        for(int i = 0 ; i<array.length ; i++){ //carga de elementos.
            System.out.println("Ingrese el elemento numero " + (i+1));
            array[i] = console.nextInt();
        }
        
        for (int num: array){ //for each
            System.out.println(num);
        }
       
    }
}
