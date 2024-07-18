package com.methodOverriding;

// child class of animal class
public class Dog extends Animal
{
		@Override
		public void makeSound()
		{
			System.out.println("Dog is barking..");
		}

}
