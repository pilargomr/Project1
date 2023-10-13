package com.java;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int velocidad = 90; //Km/h
		int limiteVelocidad = 80; 
					
		//IF anidado - IF ELSE IF
		
		boolean carretera = true;
		
		if (carretera) {
			//Block code
			System.out.println("Carretera");
			
			limiteVelocidad = 110; //km/h
			
			if (velocidad > limiteVelocidad) {
				System.out.println("El coche va a exceso de velocidad, multa!");
			} else {
				System.out.println("El coche va en la velocidad adecuada, felicidades!");
			}	
			
		} else if (velocidad > limiteVelocidad) {
			System.out.println("Calle");
			System.out.println("El coche va a exceso de velocidad, multa!");
	 	}else {
	 		System.out.println("El coche va en la velocidad adecuada, felicidades!");
	 	}
		
		//SWITCH CASE
		
		int temperatura = 15;
		
		switch (temperatura) {
		
		case 5:
			System.out.println("Clima muy frio");
			break;
			
		case 10:
		case 15:
			System.out.println("Clima frio");
			break;
			
		case 20:
		case 25:
			System.out.println("Clima templado");
			break;
			
		case 30:
			System.out.println("Clima calido");
			break;
			
		default:
			System.out.println("Clima no reconocido por el sistema");
			break;
		}
		
	}
}
