package com.epam.OOP;

public class Animal {
	private String color;
	private int numberOfPaws;
	private boolean hasFur;

	public Animal(String color, int numberOfPaws, boolean hasFur){
		this.color = color;
		this.numberOfPaws = numberOfPaws;
		this.hasFur = hasFur;
	}

	public String getDescription(){
		String pawWordForm = numberOfPaws < 2 ? "paw" : "paws";
		String furDescription = hasFur ? "a" : "no";
		return "This animal is mostly " + color + ". It has " + numberOfPaws + " " + pawWordForm +  " and " + furDescription + " fur.";
	}

	public static void main(String[] args){
		Animal animal = new Animal("blue", 2, false);
		System.out.println(animal.getDescription());
	}

}
