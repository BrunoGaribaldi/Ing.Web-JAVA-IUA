/*
declarar clase cuenta con los atributos nombre saldo numero y tipo
con los metodos depositar(recibe la cantidad a depositar) retirar(recibe la cantidad a retirar)
se efectuará el retiro si el saldo es mayor igual a la cantidad a retirar y un metodo imprimir
*/
package Ejercicios_de_práctica;


public class ejercicio_1 {
    String nombre;
    private int numero; 
    private double saldo; 
    String tipo; 
    
    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
    public void setNumero(int numero){
        this.numero = numero; 
    }
    public void depositar(double depositar){
        saldo += depositar; 
    }
    
    public void retirar (double retirar){
        if(saldo>=retirar)
            saldo -= retirar;else
            System.out.println("No hay saldo disponible");
    }
    
    public String toString(){
        return "Nombre = " + nombre + " \nNumero = " + numero + "\nSaldo = " + saldo + "\nTipo = " + tipo; 
    }

}
