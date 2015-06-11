package com.zywu.c05;

public class InnerClass {

	private static PackagedClass pa;

	public static void main(String[] args) {
		setPa(new PackagedClass());
	}

	public static PackagedClass getPa() {
		return pa;
	}

	public static void setPa(PackagedClass pa) {
		InnerClass.pa = pa;
	}

}
