import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CatalogoDeRecetas {

    private Map<String,Receta> recetas;
    /**
     * Constructor del CatalogoDeRecetas
     * Inicializa las variables internas
     */
    public CatalogoDeRecetas(){
        recetas = new HashMap<String,Receta>();
    }

    /**
     * Obtiene la receta correspondiente al nombre
     * @param nombre la Receta asociada a este nombre
     * @return
     */
    public Receta getReceta (String nombre){
        return recetas.get(nombre);
    }
    
    /**
     * Agrega una receta al Catalogo
     * @param receta la receta a Agregar
     * @throws IllegalArgumentException si ya existe una receta con ese nombre en el catalogo
     */
    public void agregarReceta (Receta receta){
        if (recetas.containsKey(receta.getNombre()))
            throw new IllegalArgumentException("Receta Duplicada");
        recetas.put(receta.getNombre(),receta);
    }
    
    /**
     * Devuelve la cantidad de recetas en este catalogo
     * @return la cantidad de recetas del catalogo
     */
    public int getCount(){
        return recetas.size();
    }
    
    /**
     * Remueve la receta del catalogo cuyo nombre es pasado como argumento
     * @param nombre el nombre de la receta a remover
     * @return true cuando pudo remover la receta, false si la receta no existia en el catalogo
     */
    public boolean removerReceta (String nombre){
        if (recetas.containsKey(nombre)){
            recetas.remove(nombre);
            return true;
        }
        return false;
    }
    
    /**
     * Obtiene una lista de los nombres de las recetas contenidas en el catalogo
     * @return la lista de los nombres de las recetas inlcuidas en el catalogo
     */
    public List<String> indice(){
        //TODO: Implementar
        List<String> lista = new ArrayList<>();
        for(Receta r : recetas.values())
        {
            lista.add(r.getNombre());
        }
        return lista;
    }
}
