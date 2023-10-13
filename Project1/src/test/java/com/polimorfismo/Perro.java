package com.polimorfismo;

public class Perro extends Animal {

	public Perro() {
		super("Perro");
	}

	@Override
	public void speak() {
		System.out.println(getAnimal() + " Guauf guauf");

	}

}
