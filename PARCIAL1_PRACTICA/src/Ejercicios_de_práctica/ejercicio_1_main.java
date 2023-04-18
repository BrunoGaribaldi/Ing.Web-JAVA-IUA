
package Ejercicios_de_práctica;

import java.util.Scanner;

public class ejercicio_1_main {
    public static void main(String[] args) {
        String nombre; 
        int numero; 
        double saldo; 
        String tipo;
        ejercicio_1 e = new ejercicio_1();//constructor por omision.
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        nombre = console.nextLine(); 
        e.nombre = nombre;
        System.out.println("Ingrese numero");
        numero = Integer.parseInt(console.nextLine());
        e.setNumero(numero);
        System.out.println("Ingrese el saldo");
        saldo = Double.parseDouble(console.nextLine());
        e.setSaldo(saldo);
        System.out.println("Ingrese tipo");
        tipo = console.nextLine();
        e.tipo=tipo; 
        System.out.println("Ingrese la cantidad que desea depositar");
        saldo = Double.parseDouble(console.nextLine());
        e.depositar(saldo);
        System.out.println(e);
        System.out.println("Ingrese la cantidad que desea retirar");
        e.retirar(Double.parseDouble(console.nextLine()));
        System.out.println(e);
    }
}
