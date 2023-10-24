import java.util.HashMap;
import java.util.Map;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private Map<Equipo,Integer> goles;
    private Estado estado;
    
    /**
     * Crea cada encuentro en base a los equipos indicados y
     * establece el estado del partido a NoDisputado().
     * Los goles se registran en un mapa donde la clave es el
     * equipo y el valor es la cantidad de goles.
     * 
     * @param equipo1 Uno de los equipos.
     * @param equipo2 El otro de los equipos.
     */
    public Partido (Equipo equipo1, Equipo equipo2){
        // TODO Implementar constructor (inicializar colecciones)
        // No modificar la siguiente linea
        estado = new NoDisputado();
    }

    /**
     * Anota un gol al equipo que lo haya realizado a través
     * del objeto en el campo estado. Tambien debe registrar
     * el gol en sus estadisticas el equipo correspondiente.
     * 
     * @param e El equipo que hizo el gol.
     */
    public void addGol (Equipo e) {
        // TODO Implementar cuenta de goles
    }

    /**
     * Establece el estado del partido a EnJuego.
     */
    public void setEnJuego () {
        estado = new EnJuego();
    }

    /**
     * Establece el estado del partido en Finalizado
     * y actualiza estadisticas de partidos disputados
     * y puntajes de cada equipo.
     */
    public void setFinalizado () {
        // TODO Implementar actualizacion de partidos disputados y puntajes
        // No modificar la siguiente linea
        estado = new Finalizado();
    }

    /**
     * Devuelve verdadero si el partido está en estado finalizado.
     * 
     * @return boolean true si el partido ha finalizado.
     */
    public boolean isFinalizado(){
        return estado.isFinalizado();
    }

    public String toString () {
        return estado.toString();
    }

    // Patron state
    private abstract class Estado {
        /**
         * Devuelve los goles por equipo del partido.
         * Ej.: Goleadores 1 - SuperGol 2
         * 
         * @return String Los goles por equipo del partido.
         */
        public String toString () {
            return equipo1.getNombre() + " " + goles.get(equipo1).toString() + " - " + equipo2.getNombre() + " " + goles.get(equipo2).toString();
        }
        public void addGol (Equipo e) {
            throw new IllegalStateException(this.toString());
        }
        public void CalcularPuntajes (){
            throw new IllegalStateException(this.toString());
        }
        public boolean isFinalizado () {
            return false;
        }
    }

    private class NoDisputado extends Estado {
        public String toString () {
            return "Partido no disputado - (" + equipo1.getNombre() + " vs " + equipo2.getNombre() + ")";
        }
    }

    private class EnJuego extends Estado {
        public String toString () {
            return "En juego: " + super.toString();
        }
        @Override
        public void addGol (Equipo e) {
            goles.replace(e, goles.get(e) + 1);
        }
    }

    private class Finalizado extends Estado {
        public String toString () {
            return "Finalizado: " + super.toString();
        }

        /**
         * Otorga 3 puntos al equipo ganador y 0 al equipo perdedor.
         * En caso de empate otorga 1 punto a cada equipo.
         * (addPuntoje() de Equipo)
         */
        public void CalcularPuntajes (){
            // TODO Implementar la asignacion de puntajes a los equipos
        }

        @Override
        public boolean isFinalizado () {
            return true;
        }
    }
}
