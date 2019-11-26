import java.util.Scanner;


public class Eleccion {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nombre de un mes");
		String mes = sc.next();
		sc.close();
		switch (mes.toLowerCase()) {
			case "febrero" :
				System.out.printf("%S tiene 28 días%n", mes);
				break;
			case "abril" :
				System.out.printf("%S tiene 30 días%n", mes);
				break;
			case "junio" :
				System.out.printf("%S tiene 30 días%n", mes);
				break;
			case "septiembre" :
				System.out.printf("%S tiene 30 días%n", mes);
				break;
			case "noviembre" :
				System.out.printf("%S tiene 30 días%n", mes);
				break;
			default:
				System.out.printf("%S tiene 31 días%n", mes);
				break;
		}
	}
}

