package com.epam.OOP;

public class Dog extends Animal {

	public Dog(String color, int numberOfPaws, boolean hasFur) {
		super(color, numberOfPaws, hasFur);
		//TODO Auto-generated constructor stub
	}

	public Dog(){
		super("brown", 4, true);
	}

	public static void main(String[] args){
		Dog dog = new Dog();
		System.out.println(dog.getDescription());
	}
}
