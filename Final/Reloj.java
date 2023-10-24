import java.util.Date;


public class Reloj {
    private static Date horaActual = new Date();
    private Date horaAlarma = null;
    
    /**
     * Setea la fecha/hora actual
     * @param hora la fecha/hora actual
     */
    public static void setHoraActual(Date hora){
        horaActual=hora;
    }
    
    /**
     * Retorna la hora actual
     * @return la hora actual
     */
    public static Date getHoraActual(){
        return horaActual;
    }
    
    /**
     * Retorna la hora del Timer
     * @return la hora a la cual esta seteado el Timer
     */
    public Date getHoraAlarma(){
        return horaAlarma;
    }
    
    /**
     * Setea la alarma del reloj, a la hora correspondietne a la hora actual mas el valor pasado como argumento 
     * @param intervaloEnMinutos el intervalo de tiempo para setear la hora de la alarma
     *  
     */
    public void setAlarmaEn(int intervaloEnMinutos){
        horaAlarma = new Date(horaActual.getTime() + intervaloEnMinutos * 60 * 1000);
    }
    
    /**
     * limpia la hora de la Alarma
     */
    public void limpiarAlarma(){
        horaAlarma=null;
    }
}
