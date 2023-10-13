package com.polimorfismo;
//* Polimorfismo - Agregar las clases de Gallo y Perro y tratar de implementarlas en el metodo main

public class Main {

	public static void main(String[] args) {

		// Humano
		Animal animal = new Humano();
		animal.speak();

		// Gato
		animal = new Gato();
		animal.speak();

		// Gallo
		animal = new Gallo();
		animal.speak();

		// Perro
		animal = new Perro();
		animal.speak();
	}

}
