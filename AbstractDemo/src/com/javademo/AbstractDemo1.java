package com.javademo;

// No concreaye class will have a abstrct method
//It is not compulsory that abstract class must have abstract methods. 
//It may or may not have abstract methods. 
//But the class which has at least one abstract method must be declared as abstract.
//Abstract Class can be a combination of concrete and abstract methods.
//Any class extending an abstract class must implement all abstract methods. 
//If it does not implement, it must be declared as abstract.
//abstract methods can not be private
abstract class Animal 
{
	public Animal()
	{
		
	}
	abstract void soundAnimal(); // abstract method
	void display() //concreate method
	{
		System.out.println();
	}
	
	void show() // concreate method
	{
		
	}
	
	abstract void abc();
}

class Cat extends Animal
{

	@Override //annotation
	void soundAnimal() 
	{
		System.out.println("Meow");
	}

	@Override
	void abc() 
	{
		
	}
	
}

class Cow extends Animal
{

	@Override
	void soundAnimal() 
	{
		System.out.println("Hmmm");
	}

	@Override
	void abc() 
	{
		
	}
	
}
public class AbstractDemo1 
{

	public static void main(String[] args)
	{
		// you can not create object of abstract class
		//Animal a1 = new Animal();
		
		Cat c1 = new Cat();// concerate class
		Animal a1 = c1;// abstract class
		// constract class object is auto upcasted to the abstract class
		a1.soundAnimal();
	}

}
