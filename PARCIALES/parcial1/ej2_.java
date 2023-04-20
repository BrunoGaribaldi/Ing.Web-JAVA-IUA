package parcial1;

import java.util.Scanner;


public class ej2_ {
    static void funcRecursiva (int i){
        
        if (i != 1){
            funcRecursiva(i-1);
            System.out.println(i);
            
        }else{
            System.out.println(i);
        }
       
    }
    public static void main(String[] args) {
        int i = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Desee hasta que número desea imprimir");
        funcRecursiva(console.nextInt());
   }
}
