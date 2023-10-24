/**
 * Clase de modela un producto que se vende en un
 * supermercado
 * 
 * @author Emiliano Daniele 
 * @version 1.0
 */
public class Producto
{
    private TipoProducto tipo;
    private String marca;
    private Double precio;

    /**
     * Constructor de la clase Producto
     * 
     * @param   tipo    El tipo de producto
     * @param   marca   La marca del producto
     * @param   precio  El precio del producto
     */
    public Producto(TipoProducto tipo, String marca, Double precio)
    {
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
    }

    
    /**
     * Devuelve un string con los detalles del producto
     */
    public String getDetalles()
    {
        String s =  "Tipo de Producto: " + tipo + "\n" +
                    "Marca: " + marca + "\n" +
                    "Precio: $" + precio + "\n\n";        
        return s;        
    }    
    
    public TipoProducto getTipo()
    {
        return tipo;
    }    

    public String getMarca()
    {
        return marca;
    }    
    
    public Double getPrecio()
    {
        return precio;
    }    
    
    public void setTipo(TipoProducto tipo)
    {
        this.tipo = tipo;
    }    
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }    
    
    public void setPrecio(Double precio)
    {
        this.precio = precio;
    }
}
