package the_essence_of_java.Chapter_07;

class SuperTest {
	public static void main(String args[]) {
		Child5 c = new Child5();
		c.method();
	}
}

class Parent5 {
	int x=10;
}

class Child5 extends Parent5 {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
