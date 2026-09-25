package classe;

public class AreaCircTeste {

	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 100;
		
		// AreaCirc.PI = 3.1415;
		
		System.out.println(AreaCirc.area(a1.raio));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}
}
