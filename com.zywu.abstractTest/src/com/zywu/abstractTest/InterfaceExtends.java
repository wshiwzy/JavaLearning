package com.zywu.abstractTest;

interface A {
	void f1();
}

interface B extends A {
	void f2();
}

class AA implements B {

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f2() {
		// TODO Auto-generated method stub

	}

}

interface C {
	void f1();
}

class cc {
	void f1() {
	};
}

class EE extends cc implements C {

	public void f1() {
	};
}

interface D extends B, C {
	void f3();
}

class BB implements D {

	@Override
	public void f2() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}

	@Override
	public void f3() {
		// TODO Auto-generated method stub

	}

}

public class InterfaceExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
