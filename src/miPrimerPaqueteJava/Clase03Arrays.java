package miPrimerPaqueteJava;
import java.util.Arrays;
//import java.util.Collections;

public class Clase03Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int vector[] = new int [5];
//		vector[0] = 12;
//		vector[1] = 23;
//		vector[2] = 45;
//		vector[3] = 56;
//		vector[4] = 78;
		
		//ejercicio A
//		int []vector = {12,23,45,56,78};
//		int x = 45, suma=0;
//		
//		for(int i=0; i<vector.length; i++) {	
//			if(x<vector[i]) {
//				suma = suma + vector[i];
//			}
//		}
//		System.out.print("La suma es: "+suma);
		
		
		//ejercicio B
		
		int []vector = {12,23,5};	
		Arrays.sort(vector);
		for(int i=0; i<vector.length; i++) {	
			System.out.print(vector[i]+" ");
			
		}
	}

}
