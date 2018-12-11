/**
 * 
 */

/**
 * @author Carlos_cg
 * @version 1.0
 *
 */

public class Rectangulo {

	// Atributos
	
	private int base;
	private int altura;

	// Constructor/es
	
	/**
	 * Constructor unico para crear objetos de tipo rectangulo.
	 * @param base int relacionado ccon la base del rectangulo.
	 * @param altura int relacionado ccon la base del rectangulo.
	 */
	
	public Rectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}

	// Getters

	/**
	 * @return base la base del retangulo
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @return altura la altura del retangulo
	 */
	public int getAltura() {
		return altura;
	}

	// Setters
	
	/**
	 * @param base la base del rectangulo 
	 */
	public void setBase(int base) {
		this.base = base;
	}


	/**
	 * @param altura la altura del rectangulo a modoficar
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return " Rectángulo de base " + base + " y altura " + altura;
	}	
	
	
}

