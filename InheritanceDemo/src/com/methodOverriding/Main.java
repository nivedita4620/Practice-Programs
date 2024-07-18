package com.methodOverriding;

public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Animal a1 = new Dog();//output->Dog is barking..
		
		//Animal a1 = new Animal();//output-> Animal sounds..
		
		a1.makeSound();

	}

}
