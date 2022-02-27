package DemoModule;

import java.util.Scanner;

public class Temperature1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperature in celsius");
		float celsius =sc.nextFloat();
		float Fahrenheit = (celsius*9/5)+32;
		System.out.println("Temperature in Fahrenheit" +Fahrenheit);
		
		
	}

}
