package com.zywu.InnerClassTest3;

import com.zywu.InnerClassTest2.*;

public class AInterfaceImplTest {

	protected class AInterfaceImpl implements AInterface {
		
		public AInterfaceImpl() {
			// TODO Auto-generated constructor stub
		}

		@Override
		public void f() {
			// TODO Auto-generated method stub
			System.out.println("AInterfaceImpl.f()");
		}
	}
	
	
}
