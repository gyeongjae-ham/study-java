package the_essence_of_java.Chapter_07;

class A2 {
    void autoPlay(I i) {
          i.play();
     }
 }

 interface I {
      public abstract void play();
 }

 class B2 implements I {
     public void play() {
          System.out.println("play in B2 class");
     }
 }

 class C implements I {
     public void play() {
          System.out.println("play in C class");
     }
 }

class InterfaceTest2 {
	public static void main(String[] args) {
		A2 a = new A2();
		a.autoPlay(new B2()); // void autoPlay(I i)ȣ��
		a.autoPlay(new C()); // void autoPlay(I i)ȣ��
	}
}
