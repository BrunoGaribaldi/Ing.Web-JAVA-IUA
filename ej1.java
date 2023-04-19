/*
crear un programa que haga clases de vehiculos. la patente es random. vehiculo. marca. color, cantidad de pasajeros.
despues comparar los vehiuclos para ver si son del mismo tipo. si son iguales comparar los precios para ver cual es más conveniente.
con una funcioin calcular cual es más conveniente.

*/
package ejerciciosdepráctica_posta;

import java.util.Random;

public class ej1
{
    private String marca;
    public String color; 
    private int pasajeros;
    private int patente;
    private int precio;
    
    public ej1(){};
    
    public ej1 (String marca, String color, int pasajeros, int precio){
        var numrandom = new Random();
        int valorAleatorio = numrandom.nextInt(123456+1);
        this.marca = marca;
        this.color = color; 
        this.pasajeros = pasajeros; 
        this.precio = precio;
    }
    
    public String toString (){
        return "marca = " + marca + "\ncolor = " + color + "\npasajeros = " + pasajeros + "\npatente = " + patente;
    }
    
    public boolean equals (Object o){
        ej1 ejemplo = (ej1)o; 
        return ((marca == ejemplo.marca) && (color == ejemplo.color));
    }
    
    public int getPrecio(){
        return precio;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
}
