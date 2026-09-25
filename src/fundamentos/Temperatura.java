package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) * 5/9 = ºC
		final double FATOR = 5.0 / 9.0;
		final int AJUSTE = 32;
		
		double fahrenheit = 86;
		
		double celsius;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + " em Celsius é : " + celsius);		
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println(fahrenheit + " em Celsius é : " + celsius);
		
	}
}
