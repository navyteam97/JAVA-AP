package miPrimerPaqueteJava;

public class miPrimeraClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello Wolrd");
		
		int numeros[] = new int[] {1, 2, 3};
		
		//System.out.println(numeros.length);
		
		//for normal
//		for(int indice=0; indice<numeros.length;indice++) {
//		 System.out.print(numeros[indice] + " ");	
//		}
		
		//foreach
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}


}
