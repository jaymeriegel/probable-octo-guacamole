/**
 * 
 */
package exemplos.uri1002;

import java.util.Scanner;

/**
 * @author Jayme Gomes
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado;
		double raio;
		Circle c1;
		double area;
		
		teclado = new Scanner(System.in);
		raio = teclado.nextDouble();
		teclado.close();
		
		c1 = new Circle(raio);
		area = c1.getArea();
		
		System.out.printf("A = %.4f\n", area);
	}

}
