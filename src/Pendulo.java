
public class Pendulo {

	// Atributos
	private float longitud;

	// Constructor
	public Pendulo(float longitud) {
		this.longitud = longitud;
	}

	// Getter 
	public float getLongitud() {
		return longitud;
	}
	
	// Metodo 
	
	
	public float calcularPeriodo() {
		float periodo = (float) (2 * Math.PI * Math.sqrt(longitud / 9.8));
		return periodo;
	}
	
	
	// @Override
	@Override
	public String toString() {
		return "Pendulo [longitud=" + longitud + "]";
	}


}
