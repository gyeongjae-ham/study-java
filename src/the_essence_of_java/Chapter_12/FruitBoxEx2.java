package the_essence_of_java.Chapter_12;

import java.util.ArrayList;

class Fruit1 implements Eatable {
	public String toString() { return "Fruit1";}
}
class Apple1 extends Fruit1 { public String toString() { return "Apple1";}}
class Grape1 extends Fruit1 { public String toString() { return "Grape1";}}
class Toy1		          { public String toString() { return "Toy1"  ;}}

interface Eatable {}

class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit1> fruitBox = new FruitBox<Fruit1>();
		FruitBox<Apple1> appleBox = new FruitBox<Apple1>();
		FruitBox<Grape1> grapeBox = new FruitBox<Grape1>();
//		FruitBox<Grape1> grapeBox = new FruitBox<Apple1>(); // 에러. 타입 불일치
//		FruitBox<Toy1>   toyBox    = new FruitBox<Toy1>();   // 에러.

		fruitBox.add(new Fruit1());
		fruitBox.add(new Apple1());
		fruitBox.add(new Grape1());
		appleBox.add(new Apple1());
//		appleBox.add(new Grape1());  // 에러. Grape는 Apple의 자손이 아님
		grapeBox.add(new Grape1());

		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	}  // main
}

class FruitBox<T extends Fruit1 & Eatable> extends Box1<T> {}

class Box1<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item)  { list.add(item);      }
	T get(int i)      { return list.get(i); }
	int size()        { return list.size();  }
	public String toString() { return list.toString();}
}