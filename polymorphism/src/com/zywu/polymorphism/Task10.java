package com.zywu.polymorphism;

class BaseClass{
	void f(){
		System.out.println("b.f");
		g();
		
	}	
	void g(){
		System.out.println("b.g");
	}	
}
class DevideClass extends BaseClass{	
	@Override
	void g(){
		System.out.println("d.g");
	}	
}


public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bClass=new DevideClass();
		bClass.f();

	}

}
