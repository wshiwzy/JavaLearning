package com.zywu.abstractTest;

abstract class BaseClass{
	public BaseClass() {
		// TODO Auto-generated constructor stub
		print();
	}
	abstract void print();
}

class DevideClass extends BaseClass{
	int a=3;
	@Override
	void print(){
		System.out.println(a);
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DevideClass devideClass=new DevideClass();
		devideClass.print();
	}

}
