package com.zywu.trycatch;

class MyException extends Exception{
	public MyException(String Msg) {
		// TODO Auto-generated constructor stub
		super(Msg);
	}
}
public class TryTest {

	
	public static void f() throws MyException  {
		System.out.println("MyException");
		if(Math.random()>0.5)
			try {
				throw new MyException("test");
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw e;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			f();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
