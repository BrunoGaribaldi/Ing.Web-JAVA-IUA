
public enum Ingrediente {
    HARINA(TipoDeIngrediente.POLVO),
    AZUCAR(TipoDeIngrediente.POLVO),
    GALLETA_MOLIDA(TipoDeIngrediente.POLVO),
    CACAO(TipoDeIngrediente.POLVO),
    AGUA(TipoDeIngrediente.LIQUIDO),
    ACEITE(TipoDeIngrediente.LIQUIDO),
    VAINILLA(TipoDeIngrediente.LIQUIDO),
    HUEVO(TipoDeIngrediente.LIQUIDO);
    
    private TipoDeIngrediente tipo;
    
    private Ingrediente (TipoDeIngrediente tipo){
        this.tipo = tipo;
    }
    
    public TipoDeIngrediente getTipoDeIngrediente(){
        return tipo;
    }
}
