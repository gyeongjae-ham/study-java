package the_essence_of_java.Chapter_02;

class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;
		int i = Float.floatToIntBits(f);

		System.out.printf("%f%n", f);
		System.out.printf("%X%n", i);
	}
}
