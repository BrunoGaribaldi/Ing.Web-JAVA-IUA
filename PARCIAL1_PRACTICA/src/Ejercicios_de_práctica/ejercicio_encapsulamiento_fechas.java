package Ejercicios_de_práctica;
public class ejercicio_encapsulamiento_fechas 
{
    private int dias; 
    private int mes;
    private int anio; 
    
    private int fechasToDias(){
        return anio*360 + mes*30 + dias;
    }
    private void diasToFechas(int i){
        anio = (int) i/360;
        int resto = i%360;
        mes = (int) resto / 30;
        dias = (int) resto%30;
        
        if (dias == 0)
        {
            dias = 30; 
            mes --;
        }
        
        if (mes == 0){
            mes = 12; 
            anio --;
        }
    }
    
    public void addDias(int i){ //yo lo unico que le voy a mostrar al operador es esto.
       int dia = i + fechasToDias();
       diasToFechas(dia);
       
    }
    
    public ejercicio_encapsulamiento_fechas (String s){
        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');
        this.dias = Integer.parseInt(s.substring(0, pos1));
        this.mes = Integer.parseInt(s.substring(pos1+1,pos2));
        this.anio =Integer.parseInt(s.substring(pos2+1)); 
    }
    
    public ejercicio_encapsulamiento_fechas(){
        
    }
    
    public ejercicio_encapsulamiento_fechas(int dias, int mes, int anio){
        this.dias = dias; 
        this.mes = mes; 
        this.anio = anio;
    }
    
    public String toString(){
        return dias + "/" + mes + "/" + anio;
    }
    
}
