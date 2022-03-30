package the_essence_of_java.Chapter_03;

class OperatorEx8 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1e
		int b = 2000000;    // 2,000,000   2e

		long c = a * b;     // a * b = 2,000,000,000,000 ?

		System.out.println(c);
	}
}
