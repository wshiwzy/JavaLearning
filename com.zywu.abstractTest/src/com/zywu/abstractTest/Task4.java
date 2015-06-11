package com.zywu.abstractTest;

abstract class abase {
	abstract void g();
}

class adevide extends abase {
	static void print(abase a) {
		// adevide devide=(adevide)a;
		a.g();
	}

	@Override
	void g() {
		System.out.println("g");
	};
}

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		adevide dAdevide = new adevide();
		adevide.print(dAdevide);
	}

}

interface Iabse {
	void sss();
}

class dd implements Iabse {

	@Override
	public void sss() {
		// TODO Auto-generated method stub
		
	}

}