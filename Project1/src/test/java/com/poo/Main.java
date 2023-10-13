package com.poo;

public class Main {

	public static void main(String[] args) {

		//Objeto
		Perro perro = new Perro(4, "Dorado", "Grande", "Golen Labador");
		System.out.println("Mi pero es de raza: " + perro.getRaza());
		
		Perro perro2 = new Perro(4, "Blanco", "Chico", "Chihuaha cabeza de manzana");
		perro2.setRaza("Unkown");
		System.out.println("Mi pero es de raza: " + perro2.getRaza());
		
		Perro perro3 = new Perro("Blanco", "Chico", "Chihuaha cojito");
		perro3.setNumPatas(10000);
		System.out.println("Mi pero es de raza: " + perro3.getRaza() + " y mi perro tiene " + perro3.getnumPatas() + " patas");
	}

}
