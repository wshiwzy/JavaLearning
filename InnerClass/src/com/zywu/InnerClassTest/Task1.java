/**
 * 
 */
package com.zywu.InnerClassTest;

import com.zywu.InnerClassTest.OutClass.InnerClass;

class OutClass {

	class InnerClass {

		int a = 3;

		public InnerClass() {
			// TODO Auto-generated constructor stub
			System.out.println("InnerClass" + a);
		}

		public void f() {
		}
	}

	public OutClass() {
		InnerClass aClass = new InnerClass();
		// TODO Auto-generated constructor stub
		System.out.println("OutClass");
	}

	public void process(InnerClass test) {
		System.out.println(test.a);
	}

	public InnerClass getAInnerClass() {
		return new InnerClass();
	}
}

/**
 * @author zywu
 *
 */
public class Task1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Task1");
		// TODO Auto-generated method stub
		OutClass aOutClass = new OutClass();
		// aOutClass.f();
		OutClass.InnerClass inner = aOutClass.new InnerClass();
		inner.f();

		System.out.println(inner.a + "");
		;

		aOutClass.process(aOutClass.getAInnerClass());
	}

}
