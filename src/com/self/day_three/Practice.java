package com.self.day_three;

public class Practice {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println(a1.show(b));//a and a
		System.out.println(a1.show(c));//a and a
		System.out.println(a1.show(d));//a and d
		System.out.println(a2.show(b));//b and b    b and a
		System.out.println(a2.show(c));//b and b    b and a
		System.out.println(a2.show(d));//b and b
		System.out.println(b.show(b));//b and b
		System.out.println(b.show(c));//b and b     a and d
		System.out.println(b.show(d));//b and b     a and d
	}
}

class A {
	public String show(D obj) {
		return ("A and D");
	}

	public String show(A obj) {
		return ("A and A");
	}
}

class B extends A {
	public String show(B obj) {
		return ("B and B");
	}

	public String show(A obj) {
		return ("B and A");
	}
}

class C extends B {
}

class D extends B {
}
