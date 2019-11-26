import java.util.Scanner;


public class Test {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un valor entero positivo, si introduces negativo acaba el programa:");
		int valor = sc.nextInt();
		sc.close();
		if (valor < 0 ) {
			System.out.println("Introducido valor negativo");
			//System.exit(1);
			return;
		}
		int valorDoble  = Auxiliar.obtenerValorDuplicado(valor);
		OtraClase.separador();
		System.out.printf("Dado el valor %d, su valor doble es %d y su valor triple es %d%n", 
								valor, valorDoble, Auxiliar.obtenerValorTriple(valor));
		OtraClase.separador();
		System.out.printf("Valor de la constante de la otra clase %d%n", Auxiliar.CONSTANTE);
		otroSeparador();
	}
	public static void otroSeparador() {
		System.out.println("##############################################");
	}

}
class OtraClase {
	public static void separador() {
		System.out.println("..............................................");
	}
}
