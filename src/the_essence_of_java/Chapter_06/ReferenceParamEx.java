package the_essence_of_java.Chapter_06;

class Data3 { int x; }

class ReferenceParamEx {
	public static void main(String[] args) {

		Data3 d = new Data3();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}

	static void change(Data3 d) {
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}

