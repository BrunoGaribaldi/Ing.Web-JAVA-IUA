
public class MedidorDomiciliario extends Medidor {

    public MedidorDomiciliario(CoordenadaGPS coordenadas) {
        super(coordenadas);
    }
    @Override
    public TipoMedidor getTipoMedidor() {
        return TipoMedidor.DOMICILIARIO;
    }

    
}
