package com.zywu.finaldata;

public class InitialOrder {

	public InitialOrder(){
		System.out.println("Constructor");
	}
	private static int a;
	
	private int b;
	
	static{
		InitialOrder.a=3;
		System.out.println(a);
		
		InitialOrder test=new InitialOrder();
		test.f();
		test.b=1000;
		
		System.out.println(test.b);
		
		System.out.println("static 1");
	}
	
	static {
		InitialOrder.a=4;
		System.out.println(a);
		System.out.println("static 2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
		InitialOrder tInitialOrder=new InitialOrder();
		tInitialOrder.f();
		
	}
	
	static {
		InitialOrder.a=5;
		System.out.println(a);
		System.out.println("static 3");
	}


	private void f() {
		// TODO Auto-generated method stub
		System.out.println("hahahah ");
	}

}
