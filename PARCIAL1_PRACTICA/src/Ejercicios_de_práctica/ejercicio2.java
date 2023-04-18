package Ejercicios_de_práctica;
public class ejercicio2 {
    public int dia; 
    public int mes; 
    public int anio;
    public ejercicio2 (int dia, int mes, int anio){
        this.dia = dia; 
        this.mes = mes;
        this.anio = anio; 
    }
    public String toString(){
        return dia + "/" + mes + "/" + anio;
    }
    public boolean equals (Object o){
        ejercicio2 r = (ejercicio2)o;
        return (dia==r.dia) && (mes==r.mes) && (anio==r.anio);
    }
    public static void main(String[] args) {
        int dia=0;
        int mes=1;
        int anio=3;
        boolean b;
        ejercicio2 e = new ejercicio2(dia,mes,anio);
        dia=1;
        mes=2;
        anio=3;
        ejercicio2 f = new ejercicio2 (dia,mes,anio);
        b = e.equals(f);
        System.out.println(b);
        
    }
}
