
public abstract class Contenedor {
    private int capacidad;
    private int contenidoActual;
    protected Ingrediente ingrediente;

    
    /**
     * Constructor con parametro
     * @param capacidad la capacidad del Contenedor
     * @throws IllegalArgumentException si la la capacidad es negativa.

     */
    public Contenedor (int capacidad){
        if (capacidad<0)
            throw new IllegalArgumentException();
        this.capacidad=capacidad;
    }
    
    /**
     * getter
     * @return la capacidad del Contenedor
     */
    public int getCapacidad(){
        return capacidad;
    }
    
    
    /**
     * Reprovisiona la cantidad indicada de ingrediente al contenedor
     * @param cantidad la cantidad a ingresar
     * @throws IllegalArgumentException si la cantidad a agregar supera la capacidad del tanque, o 
     * si la cantidad es negativa.
     */
    public void reprovisionarIngrediente(int cantidad){
        if (contenidoActual+cantidad>capacidad)
            throw new IllegalArgumentException();
        contenidoActual+=cantidad;
    }
    
    /**
     * Extraer la cantidad especificada de Ingrediente del Contenedor
     * @param cantidad la cantidad a extraer
     * @throws IllegalArgumentException si el contendio actual del contenedor es insuficiente para la cantidad
     * de ingreditne a extraer, o si la cantidad es negativa
     */
    public void extraerIngrediente(int cantidad){
        if (cantidad<0||cantidad>contenidoActual)
            throw new IllegalArgumentException("No hay cantidad suficiente almacenada");
        contenidoActual-=cantidad;
    }
    
    /**
     * getter
     * @return El contenido de ingrediente actual del Conenedor
     */
    public int getContenidoActual(){
        return contenidoActual;
    }
    
    /**
     * getter
     * @return el nivel de llenado actual, contenido actual vs capacidad del contenedor
     */
    public double getNivelDeLlenado(){
        return contenidoActual/capacidad;
    }
    
    /**
     * El ingrdiente almacenado en el Contenedor.
     * @return el Ingediente almacenado
     */
    public abstract Ingrediente getIngredienteAlmacenado();
}
