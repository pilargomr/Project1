package com.java;
//Los gatos pasan la mayor parte del d�a jugando. En particular, juegan si la temperatura est� entre 25 y 35 (inclusive). A menos que sea verano, el l�mite superior es 45 (inclusive) en lugar de 35.
//
//Escriba un m�todo isCatPlaying que tenga 2 par�metros. El m�todo debe devolver verdadero si el gato est� jugando; de lo contrario, devolver falso
//
//El primer par�metro debe ser de tipo booleano y debe llamarse "verano" que representa si es verano.
//El segundo par�metro representa la temperatura y es de tipo int con el nombre "temperatura".
//
//
//EJEMPLOS DE ENTRADA / SALIDA:
//
//* isCatPlaying (verdadero, 10); debe devolver falso ya que la temperatura no est� en el rango de 25 a 45
//
//* isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no est� en el rango de 25 a 35 (el par�metro de verano es falso)
//
//* isCatPlaying (falso, 35); deber�a volver a verdadero ya que la temperatura est� en el rango de 25 a 35


public class TareaGato {

	public static void main(String[] args) {
		boolean resultado;

		resultado = isCatPlaying(true, 10);
		System.out.println(resultado);
		resultado = isCatPlaying(false, 36);
		System.out.println(resultado);
		resultado = isCatPlaying(false, 35);
		System.out.println(resultado);
	}

	public static boolean isCatPlaying(boolean verano, int temperatura) {
		if (verano) {
			if (temperatura >= 255 && temperatura <= 45) {
				return true;
			} else {
				return false;
			}
		} else if (temperatura >= 25 && temperatura <= 35) {
			return true;
		} else {
			return false;
		}

	}
}
