import java.util.List;
import java.util.Set;
import java.util.TreeSet;


/**
 * Modela la tabla de posiciones del torneo como un conjunto ordenado. 
 */
public class TablaResultados {
    private Set<Equipo> tabla;
    private List<Equipo> clubes;

    public TablaResultados(List<Equipo> clubes) {
        this.clubes = clubes;
        tabla = new TreeSet<>(clubes);
    }

    /** 
     * Cada vez que se llama se rearma la tabla de posiciones desde cero.
     */
    public void CalcularPosiciones () {
        tabla.clear();
        tabla.addAll(clubes);
    }

    /**
     * Genera la tabla de posiciones como texto.
     * 
     * @return String La tabla de posiciones
     */
    public String toString () {
        StringBuffer posiciones = new StringBuffer("Pos | Puntos | Goles | Nombre\n");
        Integer pos = 1;
        for (Equipo equipo : tabla) {
            posiciones.append(pos + " | " + equipo.getPuntaje() + " | " + equipo.getGoles() + " | " + equipo.getNombre() + "\n");
            pos = pos + 1;
        }
        return posiciones.toString();
    }
}
