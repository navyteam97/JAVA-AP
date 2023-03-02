package miPrimerPaqueteJava;

public class Clase03Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vector[] = new int [5];
		
		vector[0]= 12;
		vector[1] = 23;
		vector[2] = 45;
		vector[3] = 56;
		vector[4] = 78;
		
		for(int i=0; i<vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

}
