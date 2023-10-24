
public class Lectura {

	private Fecha fechaDeLectura;
	private String medidorId;
	private int valorDeLectura;
	
	public Lectura (Medidor m, Fecha f){
		this.fechaDeLectura = f;
		this.valorDeLectura = m.getConsumoAcumulado();
		this.medidorId = m.getId();
	}
	
	public Fecha getFechaDeLectura() {
		return fechaDeLectura;
	}
	public String getMedidorId() {
		return medidorId;
	}
	public int getValorDeLectura() {
		return valorDeLectura;
	}
	
}
