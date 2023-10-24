import java.util.Random;

public abstract class Medidor {
	private CoordenadaGPS coordenadas;
	private String id;
	private int consumoAcumulado;
	static int contador = 0;
	
	/**
	 * Constructor
	 * @param coordenadas la ubicacion fisica del medidor
	 */
	public Medidor (CoordenadaGPS coordenadas){
		this.coordenadas = coordenadas;	
		consumoAcumulado=0;
		id = "id_"+ getTipoMedidor() + "_" + contador;
		contador++;
	}

	/**
	 * 
	 * @return Las coordenadasGPS con la ubicacion del medidor
	 */
	public CoordenadaGPS getCoordenadas() {
		return coordenadas;
	}

	/**
	 * 
	 * @return el id del medidor
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @return el consumo acumulado del medidor
	 */
	public int getConsumoAcumulado() {
		return consumoAcumulado;
	}	
	
	/**
	 * Restablece el consumo acumulado del medidor a cero
	 */
	public void resetConsumo(){
		consumoAcumulado=0;
	}
	
	/**
	 * Incrementa el consumo acumulado en el valor especificado
	 * @param consumo el valor de consumo a incrementar
	 */
	public void incrementarConsumo(int consumo){
		consumoAcumulado+=consumo;
	}
	
	/**
	 * 
	 * @return el TipoMedido
	 */
	public abstract TipoMedidor getTipoMedidor();
	
}
