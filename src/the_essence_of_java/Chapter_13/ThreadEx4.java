package the_essence_of_java.Chapter_13;

class ThreadEx4 {
	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		for(int i=0; i < 500; i++)
			System.out.printf("%s", new String("-"));		

		System.out.print("가나다라:" +(System.currentTimeMillis()- startTime));

		for(int i=0; i < 500; i++) 
			System.out.printf("%s", new String("|"));		

		System.out.print("가나다라2:"+(System.currentTimeMillis() - startTime));
	}
}
