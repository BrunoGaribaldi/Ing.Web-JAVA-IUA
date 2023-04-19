package Ej.Fechas;

import java.util.Random;

public class Class {
    private int anio; 
    private int mes; 
    private int dia;
    
    public Class(){}
    public void ingresarFecha (String s){
        int pos1 = s.indexOf('/');
        dia = Integer.parseInt(s.substring(0,pos1));
        int pos2 = s.lastIndexOf('/');
        mes = Integer.parseInt(s.substring(pos1+1,pos2));
        anio = Integer.parseInt(s.substring(pos2+1));
        
    }
    public int fechasToDias(){
        return anio*360 + mes*30 + dia;
    }
    private void diasToFechas(int dias){
        anio = (int)dias/360;
        int resto = dias%360;
        mes = resto/30;
        resto = resto%30;
        dias = resto;
        if(dia == 0){
            dia=30;
            mes--;
        }
        if (mes==0){
            mes = 12; 
            anio--;
        }
        if (anio == 0)
        {
            anio = 1990;
        }
    }
    public void addDias(){
        var aleatorio = new Random();
        int dias = aleatorio.nextInt(147+1);
        diasToFechas(dias);

    }
    public String toString(){
    return dia + "/" + mes + "/" + anio;
    }
    
    public boolean equals (Object o){
       Class objeto = (Class) o; 
       return((dia==objeto.dia)&&(mes==objeto.mes)&&(anio==objeto.anio)); 
}
    
}
