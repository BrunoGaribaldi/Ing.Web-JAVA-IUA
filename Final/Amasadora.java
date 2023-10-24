import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


public class Amasadora implements Maquina{
    
    private List<Contenedor> contenedores;
    private Estado estado = Estado.APAGADO;
    public Reloj reloj;
    private String id;
    private Receta receta;
    public int pesoLote=0;
    public static int count;

    /**
     * Constructor sin parametros
     * 
     * 1. Inicializa las variables internas (Reloj, contenderoes, etc)
     * 2. setea el id de la amasadora con el formato "am_"+<count>
     * 3. incrementea la cuenta total de count
     */
    public Amasadora(){
        //TODO: Implementar
        reloj = new Reloj();
        contenedores = new ArrayList<>();
        id = "am_" + count;
        count++;
    }
    
    /**
     * Obtiene un contenedor del ingrediente solicitado conectado a esta Amasadora
     * 
     * @param ingrediente el Ingrediente requerido
     * @return el Contenedor que contiene el ingrediente
     * @throws ContenedorNoDisponibleException cuando no existe un contenedor del ingrediente solicitado 
     * 	conectado a la amasadora 
     */
    public Contenedor getContenedorPara(Ingrediente ingrediente) throws ContenedorNoDisponibleException{
        for (Contenedor c: contenedores){
            if (c.getIngredienteAlmacenado().equals(ingrediente))
                return c;
        }
        throw new ContenedorNoDisponibleException(ingrediente.toString());
    }
    
    
    /**
     * Verifica si es posible obtener la cantidad especificada de un Ingrediente en particular
     * @param ingrediente el Ingrediente necesario
     * @param cantidad la cantidad necesaria del Ingrediente especificado
     * @return 
     * 		true si hay algun contenedor con suficiente cantidad de Ingrediente
     * 	    false si no hay ningun conenedor con sufciente cantidad de Ingrediente
     * @throws IllegalArgumentException cuando la cantidad es invalida (numero negativo), o cuando no existe
     * un contenedor del ingrediente especificado asociado a la amasadora
     */
    public boolean verificarDisponibilidadDeIngrediente (Ingrediente ingrediente, int cantidad) {
        //TODO: Implementar
        if(cantidad >= 0){
            try{
                Contenedor cont = this.getContenedorPara(ingrediente);
                if(cont.getContenidoActual() >= cantidad)
                {
                    return true;
                }else
                {
                    return false;
                }
            }catch(ContenedorNoDisponibleException e)
            {
                throw new IllegalArgumentException("no existe un contenedor del ingrediente especificado asociado a la amasadora");
            }
            
        }else{    
            throw new IllegalArgumentException("cantidad invalida");  
        }

    } 
    
    /**
     * Extrae una cantidad solicitada del Ingrediente de un contenedor asociado a la Amasadora
     * 
     * @param ingrediente el Ingrediente a extraer
     * @param cantidad la cantidad de ingrediente a extraer
     * @throws IllegalArgumentException cuando la cantidad es invalida (numero negativo), o cuando no existe
     * un contenedor del ingrediente especificado asociado a la amasadora
     */
    public void extraerIngrediente(Ingrediente ingrediente, int cantidad){
        //TODO: Implementar
        if(cantidad >= 0)
        {   
            try
            {
                for(Contenedor c : contenedores)
                {
                    if(c.equals(this.getContenedorPara(ingrediente)))
                    {
                     c.extraerIngrediente(cantidad);
                    }
                }
            } 
            catch(ContenedorNoDisponibleException e)
            {
                throw new IllegalArgumentException("no existe un contenedor del ingrediente especificado asociado a la amasadora");
            }
            
        }else{
            throw new IllegalArgumentException("cantidad invalida");
        }
          

    }
    
    /**
     * Obtiene un listado de ingredientes faltantes para poder ejecutar la Receta asociada a la Amasadora
     * 
     * Ej. La receta requiere HARINA 50, AGUA 50 y AZUCAR 20. En los contenedores conectados a la Amasadora
     * hay HARINA 30, AGUA 100, AZUCAR 10, entonces retorna una lista con [HARINA,AZUCAR]
     * 
     * @return una lista de Ingrediente faltantes para poder ejecutar la receta
     * @throws IllegalStateException cuando no existe receta asociada a la amasadora
     */
    public List<Ingrediente> getIngredientesFaltantesParaReceta() {
        //TODO: Implementa (remover)
        List<Ingrediente> listaADevolver = new ArrayList<>();
        if(this.receta != null)
        {
            List<Ingrediente> listaIngredientes = this.receta.getListaDeIngredientes(); 
            for(Ingrediente ing : listaIngredientes)
            {
               if(!verificarDisponibilidadDeIngrediente(ing , this.receta.getCantidadDeIngrediente(ing)))
               {
                   listaADevolver.add(ing);
               }
            }
            return listaADevolver;
        } else{   
            throw new IllegalStateException("no existe receta asociada a la amasadora");
        }

        
    }
        
    /**
     * Carga una receta en la amasadora. Es posible setear un valor null.
     * 
     * @param receta la Receta a cargar
     * @throws IllegalArgumentException cuando la amasadora no posee contenedor conectado 
     *   para alguno de los componentes de la receta
     */
    public void setReceta(Receta receta){
        if (receta!=null){
            for (Ingrediente ingrediente:receta.getListaDeIngredientes()){
                try {
                    getContenedorPara(ingrediente);
                } catch (ContenedorNoDisponibleException e) {
                    throw new IllegalArgumentException(e.toString());
                }	
            }
        }
        this.receta = receta;
    }
    
    /**
     * Obtiene la hora del fin del ciclo de amasado
     *
     * @return un Date con la hora del fin del cilco
     *
     * Sugerencia: utilice los metodos de la clase Reloj para obtener la hora de Alarma
     */
    public Date getHoraFinAmasado() {
        return reloj.getHoraAlarma();
    }
    
    @Override
    /**
     * Enciende la amasadora, seteando su estado apropiadamente
     */
    public void encender() {
        //TODO: Implementar
        this.estado = Estado.ENCENDIDO;
    }

    /**
     * Apaga la amasadora, seteando su estado apropiadamente
     * @throws IllegalStateException cuando se quiere apagar una maquina que estada OCUPADA
     */
    @Override
    public void apagar() {
        //TODO: Implementar
        if(this.estado == Estado.ENCENDIDO || this.estado == Estado.APAGADO )
        {
        this.estado = Estado.APAGADO;
        } else{
           throw new IllegalStateException("se quiere apagar una maquina que estada OCUPADA");
        }
    }

    
    /**
     * Inicia el proces de amasado de la receta asociada 
     * 
     * - Extrae los ingredientes necesarios para la receta
     * - Cambia estado de la amasadora a OCUPADO
     * - Setea la alarma del Reloj de la amasadora al final del ciclo de amasado segun el tiempo 
     * de amasado de la receta 
     * - Setea el peso del lote amasado (sumatoria de la cantidad de cada ingrediente de la receta)
     * 
     * @throws IllegalStateException cuando 
     *  . el Estado de la amasadora no es correcto (apagado u ocupado), 
     *  . no hay receta cargada en la amasadora
     *  . hay algun faltante de ingrediente 
     */
    public void iniciarProceso(){
        //TODO: Implementar
        if(this.estado == Estado.ENCENDIDO && this.receta != null && this.getIngredientesFaltantesParaReceta().isEmpty())
        {
            this.estado = Estado.OCUPADO;
            this.reloj.setAlarmaEn(receta.getTiempoDeAmasado());
            List<Ingrediente> listaIngredientes = this.receta.getListaDeIngredientes(); 
            for(Ingrediente ing : listaIngredientes)
            {
              this.extraerIngrediente(ing, receta.getCantidadDeIngrediente(ing));
              this.pesoLote += receta.getCantidadDeIngrediente(ing);
          }
        }else{
            throw new IllegalStateException();    
        }
    }
    
    /**
     * finaliza el proceso de la maquina
     *  - Cambia el estado a ENCENDIDO
     *  - desaloja el lote (pone el peso del lote en cero)
     *  - limpia la alarma del reloj de la amasadora (la setea a null)
     * 
     *  @throws IllegalStateException cuando el estado de la maquina esta en estado APAGADO o ENCENDIDO 
     *  (no hay ningun proceso corriendo)
     */
    public void finalizarProceso(){
        //TODO: Implementar
        if(this.estado == Estado.OCUPADO)
        {
            estado = Estado.ENCENDIDO;
            this.pesoLote = 0;
            this.reloj.limpiarAlarma();
        }else{
            throw new IllegalStateException();
        } 
            
    }
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    /**
     * Conecta un contenedor a esta amasadora 
     * @param contenedor el contenedor a conectar
     */
    public void conectarContenedor(Contenedor contenedor){
        contenedores.add(contenedor);
    }
    
    /**
     * Desconecta un contenedor de esta amasadora
     * @param contenedor el contenedor a desconectar
     */
    public void desconectarContenedor(Contenedor contenedor){
        contenedores.remove(contenedor);
    }
    
    /**
     * Retorna la lista de contenedores conectados a esta amasadora
     * @return la lista de contenederes
     */
    public List<Contenedor> getContenedores(){
        return contenedores;
    }
    
    /**
     * getter 
     * @return el estado de esta amasadora
     */
    public Estado getEstado() {
        return estado;
    }
    
    
    /**
     * setter
     * @param estado el estado de la amasadora
     */
    public void setEstado(Estado estado){
        this.estado=estado;
    }
    
    /**
     * getter
     * @return el id de esta amassadora
     */
    public String getId() {
        return id;
    }
    
    /**
     * getter
     * @return la receta asociada a la amasadora
     */
    public Receta getReceta(){
        return receta;
    }
    
    /**
     * getter
     * @return el peso del lote amasado
     */
    public int getPesoLote(){
        return pesoLote;
    }
    
    @Override
    public boolean equals(Object o){
        if (o instanceof Amasadora){
            return id.equals(((Amasadora) o).id);
        }
        return false;
    }
}

