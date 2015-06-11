package com.zywu.javastrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Apple{
	private int i;
	public Apple(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
	public int getId() {
		return i;
	}
}

public class TostringTest {

	@Override
	public String toString() {
		return "TostringTest address" + super.toString() + "\n";		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<TostringTest> vList=new ArrayList<TostringTest>();
		for (int i = 0; i < 10; i++) {
			vList.add(new TostringTest());
		}
		System.out.println(vList);
		String aString=String.format("ijlsjd lsdkj%% %s", "you:");
		System.out.println(aString);
		System.out.format("i love %s %s", "you",1);
		int[] a={1,2,3,};
		int[] b=new int[8];
		Arrays.fill(b, 34);
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.println("b="+Arrays.toString(b));
		
		ArrayList<Apple> ac=new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			
			ac.add(new Apple(i));
		}
		for (int i = 0; i < ac.size(); i++) {
			System.out.println(ac.get(i).getId());
		}
		for(Apple vv : ac)
		{
			System.out.println(vv.getId());
		}
		
		Collection<String> dd=new LinkedList<String>();
		
	}

}
