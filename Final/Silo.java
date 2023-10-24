public class Silo extends Contenedor {
    
    public Silo(Ingrediente ingrediente, int capacidad)
    {
        super(capacidad);
        if(ingrediente.getTipoDeIngrediente() != TipoDeIngrediente.POLVO)
        {
            throw new IllegalArgumentException("el tipo de ingrediente no es POLVO");
        }else{
            this.ingrediente = ingrediente;
        }

    }
    
    public  Ingrediente getIngredienteAlmacenado()
    {
        return this.ingrediente;
    }
    
    
    
}
