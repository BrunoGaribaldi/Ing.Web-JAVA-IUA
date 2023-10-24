import java.util.List;
import java.util.ArrayList;

public class TorneoPorPuntos extends Torneo{
    /**
     * Inicializa el Torneo con los equipos indicados.
     * 
     * @param equipos Los equipos del torneo.
     */
    public void InicializarTorneo (List<Equipo> equipos) {
        super.setEquipos(equipos);
        generarFixture();
        setTablaPosiciones(new TablaResultados(equipos));
    }

    public void generarFixture(){
        // Generar partidos de todos contra todos
        // Requiere que la cantidad de equipos sean par
        List<Partido> encuentros = new ArrayList<Partido>();
        
        for(int i=0; i < clubes.size(); i++){
            for(int j=1; j < clubes.size(); j++){
                Equipo e1 = clubes.get(i);
                Equipo e2 = clubes.get((i+j)%clubes.size());
                Partido p = new Partido(e1, e2);
                encuentros.add(p);
            }
        }
        setEncuentros(encuentros);
    }
}
