package com.polymorphism;

class Animal{
	
}

class Cow extends Animal{
	
}
public class Test2 {

	public void methodOne(Animal a) {
		System.out.println("Animal Version");
	}
	
	public static void methodOne(Cow c) {
		System.out.println("Cow Verson");
	}
	
	public static void main(String args[]) {
	
		Test2 t = new Test2();
		Animal a = new Animal();
		t.methodOne(a);
		Cow c = new Cow();
		t.methodOne(c);
		Animal a1 = new Cow();
		t.methodOne(a1);
	}
}
