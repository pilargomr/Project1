package com.java;
//Escribe un metodo que se llame hasEqualSum con 3 parametros de tipo int.
//
//El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros es igual a la suma del tercer parametro, en otro caso devolver false.
//
//Aqui algunos ejemplos de input y output:
//
//* hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1
//
//* hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2

public class TareaVerificadorSumaNumero {

	public static void main(String[] args) {

		System.out.println(hasEqualSum(1, 1, 1));
		System.out.println(hasEqualSum(1, 1, 2));

	}

	public static boolean hasEqualSum(int x, int y, int z) {

		// si se quiere utilizar un ternary se debe poner solo la sig linea y comentar
		// las demas
		// return (x + y == z) ? true : false;

		int xy = x + y;

		if (xy == z) {
			return true;
		}
		return false;
	}

}
