package com.zywu.finaldata;

import java.util.Random;

class Value{
	int i=1;
}
public class Test {

	final int i1=2;
	
	static final int I2=22;
	
	final Value aValue;
	
	public static final int I3=222;
	
	final int i4= (int)(Math.random()*2);
	
	static final int i5= (int)(Math.random()*2);
	
	Value v1=new Value();
	
	final Value v2=new Value();
	
	static final Value V3=new Value();
	
	final int[] a={1,2,3,4};	
	
	Test()
	{
		aValue=new Value();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		t.v2.i++;
		t.v1=new Value();
		t.a[0]++;
		
	}

}
