import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Receta {

    private HashMap<Ingrediente,Integer> mapa;
    private ArrayList<Ingrediente> listaDeIngredientes;
    private int tiempoDeAmasado;
    private final String nombre;
    
    /**
     * Constructor
     * @param nombre el nombre de la receta
     */
    public Receta(String nombre){
        this.nombre=nombre.trim();
        mapa = new HashMap<Ingrediente,Integer>();
        listaDeIngredientes = new ArrayList<Ingrediente>();
    }
    
    /**
     * Agreaga un ingrediente a la receta
     * @param ingrediente el Ingrediente a incorporar
     * @param cantidad la cantidad de Ingrediente a incorporar
     */
    public void agreagarIngrediente(Ingrediente ingrediente, int cantidad){
        if (cantidad<=0 || ingrediente == null)
            throw new IllegalArgumentException();
        
        if (mapa.containsKey(ingrediente))
            throw new IllegalArgumentException();
        
        mapa.put(ingrediente,cantidad);
        listaDeIngredientes.add(ingrediente);	
    }
    
    
    /**
     * Reordena los ingredientes de la receta, ubicando el ingrediente en el orden indicado, manteniendo los demas ingredientes el orden relativo
     * @param ingrediente
     * @param nroDeOrden
     * @throws IllegalArgumentException cuando el nroDeOrden esta fuera de rango o si el ingrediente no existe en la receta
     */
    public void cambiarOrden(Ingrediente ingrediente, int nroDeOrden){
        if (nroDeOrden>= listaDeIngredientes.size() || nroDeOrden < 0)
            throw new IllegalArgumentException();
        if (!listaDeIngredientes.contains(ingrediente))
            throw new IllegalArgumentException();
        listaDeIngredientes.remove(ingrediente);
        listaDeIngredientes.add(nroDeOrden, ingrediente);
    }
    
    
    /**
     * Retorna la cantidad necesaria para esta receta del Ingrediente especificado
     * @param ingrediente el Ingrediente 
     * @return la cantidad del ingrediente especificado
     * @throws IllegalArgumentException cuando la receta no contiene el ingrediente especificado
     */
    public int getCantidadDeIngrediente(Ingrediente ingrediente) {
        if (!mapa.containsKey(ingrediente))
            throw new IllegalArgumentException("Ingrediente inexistente en receta");
        return mapa.get(ingrediente);
    }
    
    /**
     * remueve el ingrdiente especificado de la receta
     * @param ingrediente
     * @return true si el ingrediente fue eliminado, false si no exist�a en la receta
     */
    public boolean quitarIngrediente (Ingrediente ingrediente){
        if (!listaDeIngredientes.contains(ingrediente))
            return false;
        listaDeIngredientes.remove(ingrediente);
        mapa.remove(ingrediente);
        return true;
    }
    
    /**
     * setea el tiempo de Amasado de la receta
     * @param tiempo el tiempo de amasado 
     * @throws IllegalArgumentException si el tiempo especificado es negativo
     */
    public void setTiempoDeAmasado (int tiempo){
        if (tiempo<0)
            throw new IllegalArgumentException();
        tiempoDeAmasado=tiempo;
    }
    
    /**
     * 
     *Formato: 
     
     RECETA<NL><nombre_receta><NL><nroDeOrden><SEPARADOR><Ingrediente><SEPARADOR><cantidad><NL><...>TIEMPO/<tiempoDeAmasado><NL>
     
     Sugerencia: utilice las constantes "NL" y "SEPARADOR" para lograr el formato.
     Nota: El string termina con "NL" 
     *     
     *Ejemplo:
     RECETA
     macucas
     0/HARINA/60
     1/CACAO/30
     2/AGUA/70
     3/AZUCAR/15
     TIEMPO/15
     *
     */
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("RECETA");
        sb.append(Constantes.NL);
        sb.append(nombre);
        sb.append(Constantes.NL);
        int index=0;
        for (Ingrediente ingrediente:listaDeIngredientes){
            sb.append(index);
            sb.append(Constantes.SEPARADOR);
            sb.append(ingrediente);
            sb.append(Constantes.SEPARADOR);
            sb.append(mapa.get(ingrediente));
            sb.append(Constantes.NL);
            index++;
        }
        sb.append("TIEMPO");
        sb.append(Constantes.SEPARADOR);
        sb.append(tiempoDeAmasado);
        sb.append(Constantes.NL);
        return sb.toString();
    }

////////////////////////////////////////////////////////////////////
    
    /**
     * retorna la lista de ingredientes de la receta (sin las cantidades de cada uno)
     * @return List<Ingredinte> la lista de ingredintes
     */
    public List<Ingrediente> getListaDeIngredientes(){
        return listaDeIngredientes;
    }
    
    /**
     * Retorna el tiempo de amasado de la receta
     * @return el tiempo de amasado
     */
    public int getTiempoDeAmasado (){
        return this.tiempoDeAmasado;
    }
    
    /**
     * getter
     * @return
     */
    public String getNombre() {
        return nombre;
    }

}
