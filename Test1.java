package com.polymorphism;

class Parent {

	public void property() {
		System.out.println("cash+gold");
	}
	public void education() {
		System.out.println("10th pass");
	}
}
class Child extends Parent{
	public void education() {
		System.out.println("12th pass");
	}
}
public class Test1 {

	public static void main(String args[]) {
		Parent p = new Parent();
		p.education();
		Child c = new Child();
		c.education();
		Parent p1 = new Child();
		p1.education();


	}
}
