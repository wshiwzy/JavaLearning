package com.zywu.abstractTest;


abstract class People{
	void eat(){};
	abstract void sleep();
}

class Men extends People
{
	@Override
	void eat(){
		System.out.println("men eat");
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Men aMen=new Men();
		aMen.eat();
	}

}
