package com.zywu.finaldata;

class Value2{
	public Value2() {
		// TODO Auto-generated constructor stub
		System.out.println("Construct Value2");
	}
}

class Value3{
	public Value3() {
		// TODO Auto-generated constructor stub
		System.out.println("Construct Value3");
	}
}

class Value4{
	public Value4() {
		// TODO Auto-generated constructor stub
		System.out.println("Construct Value4");
	}
}

class Value5{
	public Value5() {
		// TODO Auto-generated constructor stub
		System.out.println("Construct Value5");
	}
}

class overridetest2 {

	Value2 aValue2=new Value2();
	static final int a=1;
	static int b=2;
	final int c=3;
	int d=4;
	overridetest2(){
		System.out.println("Construct overridetest2");
	}
	void f() {

	}
	static Value3 value3=new Value3();
	private final void g() {

	}
}

class overridetest3 extends overridetest2 {

	static Value4 value4=new Value4();
	Value5 aValue2=new Value5();
	overridetest3(){
		System.out.println("Construct overridetest3");
	}
	
	void f() {
		System.out.println("overridetest3.f()");		
	}

	final void g() {
		System.out.println("overridetest3.g()");
	}
}

public class overridetest extends overridetest3 {
	overridetest(){
		System.out.println("Construct overridetest");
	}
	@Override
	public void f() {
		System.out.println("overridetest.f()");
	}

	public static void main(String[] args) {
		overridetest tOverridetest = new overridetest();
		tOverridetest.f();
		tOverridetest.g();
		
		System.out.println(tOverridetest.a);
		overridetest3 tOverridetest3 = new overridetest();

		overridetest3 tOverridetest4 = new overridetest3();
		tOverridetest3.f();
		tOverridetest3.g();

		tOverridetest4.f();
		tOverridetest4.g();
		int a = ss.sdf.ordinal();
		System.out.println(a);
	}
}

enum ss {
	sdkf, df, sdf,
}
