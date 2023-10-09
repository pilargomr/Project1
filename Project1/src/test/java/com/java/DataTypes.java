package com.java;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte abc = 125;
		short var = 30000;
		
		//long var2 = 5245425563644L;
		
		//se hace casting al valor tomando solamente el entero del numero con decimal
		//int altura = (int) 2.54;
		
		double altura =2.54;  
		
		System.out.println(altura); 
				
		char letra = '\u00D4';
		System.out.println(letra);
		
		String frase = "Hola";
		String frase2 = "Mundo";
		int frase3 = 4;
		int frase4 = 5;
		
		System.out.println(frase+frase2+frase3+frase4);
		
		System.out.println(frase3+frase4);
				
		boolean isDog = true;
		 
		int x = 3;
		int y = 4;
		int suma = x+y;
		System.out.println("La suma es: "+ suma);
		
		//UNARIO
		int a = 3;
		a++; //solo va a incrementar 1
		System.out.println("El valor de a es: "+a);
		
		//RELACIONALES
		int var1 = 3;
		int var2 = 4;
		if (var1<=var2) {
			System.out.println("HERE");
		}
		
		//CONDICIONALES
		int var4 = 3;
		int var5 = 4;
		boolean var6 = true;
		
		if (var1<=var2 && var6) {
			System.out.println("HERE2");
		}
		
		
		
		
		
		
		
		
	
	}

}
