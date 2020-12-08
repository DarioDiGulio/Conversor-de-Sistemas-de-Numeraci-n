package Utils;

import Numbers.Hexadecimal;
import Numbers.Number;
import Numbers.NumberSystem;
import com.sun.javafx.binding.StringFormatter;

public class CustomMath {

	public int divisionEntera(int divisor, int dividendo) {
		return dividendo / divisor;
	}

	public int obtenerResto(int divisor, int dividendo) {
		return dividendo % divisor;
	}

	public int divisionEnteraPorLaMitad(int numeroADividir) {
		return numeroADividir / 2;
	}


	public static Number convertDecimalToHexadecimal(Number number){
		char[] splitNumber = number.getValue().toCharArray();
		int newValue = 0;

		for (int i = 0; i < splitNumber.length; i++) {
			newValue += Integer.parseInt(splitNumber[i] + "") * Math.pow(Hexadecimal.base, i);
		}

		return new Hexadecimal(String.format("%o", newValue));
	}

	public static Number convertDecimalToBinary(Number number){
		return null;
	}

	public static Number convertHexadecimalTo(Number number){
		return null;
	}

}
