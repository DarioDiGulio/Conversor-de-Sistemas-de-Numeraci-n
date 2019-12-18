package Test;

import Clases.Conversor;
import Clases.Sistemas;

public class TestConversor {
	public static void main(String[] args) {
		Conversor conversor = new Conversor("42", Sistemas.Binario, Sistemas.Decimal);
		System.out.println(conversor.getEgresoConvertido());
		
	}
}
