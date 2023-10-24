
public class MedidorComercial extends Medidor {

    public MedidorComercial(CoordenadaGPS coordenadas) {
        super(coordenadas);
    }

    @Override
    public TipoMedidor getTipoMedidor() {
        return TipoMedidor.COMERCIAL;
    }

    
}
