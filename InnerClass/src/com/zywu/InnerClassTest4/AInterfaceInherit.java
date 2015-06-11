package com.zywu.InnerClassTest4;

import com.zywu.InnerClassTest2.AInterface;
import com.zywu.InnerClassTest3.AInterfaceImplTest;

public class AInterfaceInherit extends AInterfaceImplTest {

	AInterface getf(){
		return new AInterfaceImplTest().new AInterfaceImpl();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AInterfaceInherit dd=new AInterfaceInherit();
		
		
		dd.getf().f();
	}

}
