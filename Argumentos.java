
public class Argumentos{
	
	public static void main (String[] args) {
		double valorPrimero = 0, valorSegundo = 0;
		float valorTercero = 0;
		if (args.length > 2 ) {
			valorPrimero = Double.parseDouble(args[0]);
			valorSegundo = Double.parseDouble(args[1]);
			valorTercero = Float.parseFloat(args[2]);
		} else {
			System.out.println("Faltan argumentos");
		}
		System.out.printf("%.2f, %.2f y %.2f son los valores introducidos%n", valorPrimero, 
		valorSegundo, valorTercero);
		
	}
}

