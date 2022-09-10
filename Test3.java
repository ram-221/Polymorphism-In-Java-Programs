package com.polymorphism;

public class Test3 {

	public void methodOne(int i) {
		System.out.println("General method");
	}
	
	public void methodOne(int... i) {
		System.out.println("Var-arg method");
	}
	
	public static void main(String args[]) {
		Test3 t = new Test3();
		t.methodOne();
		t.methodOne(10,20);
		t.methodOne(10);
	}
}
