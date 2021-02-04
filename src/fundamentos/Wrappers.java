package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		byte A1 = 100;
		Byte A2 = 100;
		
		System.out.println(A1 + A2.toString());
		
		short B1 = 1000;
		Short B2 = 1000;
		
		System.out.println(B1 + B2.toString());
		
		int C1 = 10000;
		Integer C2 = 10000;
		
		System.out.println(C1 + C2.toString());
		
		long D1 = 100000;
		Long D2 = 100000L;
		
		System.out.println(D1 + D2.toString());
		
		float F1 = 123.10F;
		Float F2 = 123.10F;
		
		System.out.println(F1 + F2.toString());
		
		double G1 = 2000.5655;
		Double G2 = 2000.5655;
		
		System.out.println(G1 + G2.toString());
		
		boolean H1 = false;
		Boolean H2 = true;
		
		System.out.println(H1 + H2.toString());
		
		char I1 = 'O';
		Character I2 = 'O';
		
		System.out.println(I1 + I2.toString());
		
	}
}
