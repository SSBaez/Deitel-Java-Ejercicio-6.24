package com.ssbaez.ejercicio624;

public class NumeroPerfecto {
	
	public static void main(String[] args) {
		
		System.out.printf("%s%n%s%10s%n", "Numeros", "Perfectos", "Factores");
		
		for(int i = 1; i <= 1000; i++) {
			
			if(esPerfecto(i) == true) {
				System.out.printf("%8d = ", i);
				obtFactores(i);
				System.out.println();
			}
				
		}
		
	}//Fin de metodo main
	
	public static boolean esPerfecto(int num1) {
		
		boolean esPerfecto = false;
		int suma = 0;

		for(int i = 1; i < num1; i++) {
			
			if(num1 % i == 0)
				suma += i;
			
		}
		
		if(suma == num1)
			esPerfecto = true;
		
		return esPerfecto;
		
	}//Fin de metodo esPerfecto
	
	public static void obtFactores(int num1) {
		
		int suma = 0;
		
		for(int i = 1; i < num1; i++) {
			
			if(num1 % i == 0) {
				System.out.printf("%d", i);
				suma += i;
				
				if(suma < num1)
					System.out.print(" + ");
			}
			
		}
		
	}//Fin de metodo obtFactores

}//Fin de declaracion de clase
