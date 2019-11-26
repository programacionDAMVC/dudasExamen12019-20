import java.util.Scanner;

public class Bucles {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un nº");
		int numero = sc.nextInt();
		sc.close();
		//Mostrar datos desde 1 a numero
		for (int i = 1; i <= numero; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println(); //salto de línea
		int contador = 1;
		while (contador <= numero) {
			System.out.print(contador + " ");
			contador++;
		}
		
		int count = 1;
		System.out.println(); //salto de línea
		do {
			System.out.print(count + " ");
			count++;
		} while (count <= numero);
		
		System.out.println(); //salto de línea
		int otroContador = 0;
		while (true) {
			otroContador++;
			System.out.printf("%d ", otroContador);
			if (otroContador == numero) {
				break;
			}	
		}
		
		
		
	}
}

