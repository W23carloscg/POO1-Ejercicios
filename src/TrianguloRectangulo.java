// 4.3. Ejercicio 8
// Programa que implementa la clase Triangulo-Rectangulo usando los atributos que
// consideres oportuno y metodos para devolver el valor de la hipotenusa, el area
// del mismo, asi como el perımetro de dicho triangulo. Comprueba el funcionamiento
// con una clase denominada TestTrianguloRectangulo. Utiliza la API 
// javax.swing.JOptionPane para solicitar los valores de los catetos de dicho 
// triangulo y tambien para mostrar los datos de los metodos creados.

// TrianguloRectangulo
// - cateto1: int
// - cateto2: int
// + TriRectangulo(cateto int, cateto2 int)
// Getters Setters
// + TriRectanguloHipotenusa():double
// + TriRectanguloPerimetro():double
// + TriRectanguloArea():int
// + toString():string
//



public class TrianguloRectangulo {
	//Atributos
	
	private int cateto1;
	private int cateto2;
	
	//Constructores
	public TrianguloRectangulo(int cateto1, int cateto2) {
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}
	
	
	//Getters y setter
	
	public int getCateto1() {
		return cateto1;
	}
	
	public int getCateto2() {
		return cateto2;
	}
/**	
	public double setTriRecHipotenusa() {
    return formula;
	}
	public double setTriRecPerimetro() {
		return hipotenusa + cateto1 + cateto2 ;
	}
**/

}
