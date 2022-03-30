package the_essence_of_java.Chapter_07;

class SuperTest2 {
	public static void main(String args[]) {
		Child6 c = new Child6();
		c.method();
	}
}
class Parent6 {
	int x=10;
}

class Child6 extends Parent6 {
	int x=20;

	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x="+ super.x);
	}
}
