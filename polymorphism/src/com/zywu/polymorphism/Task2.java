package com.zywu.polymorphism;

class Cycle{
	void ride(){
		System.out.println("ride:"+this.getClass().getName());
	}
}

class Unicycle extends Cycle{		
	
}

class Bicycle extends Cycle{}

class Tricycle extends Cycle{}

public class Task2 {
	
	public static void main(String[] args) {
		Cycle cy=new Unicycle();
		cy.ride();
		cy=new Bicycle();
		cy.ride();
		cy=new Tricycle();
		cy.ride();	

	}

}
