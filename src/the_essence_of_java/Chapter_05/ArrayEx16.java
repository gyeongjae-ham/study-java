package the_essence_of_java.Chapter_05;

class ArrayEx16 {
	public static void main(String[] args) {
		System.out.println("args 길이:"+args.length);

		for(int i=0;i< args.length;i++) {
			System.out.println("args[" + i + "] = \""+ args[i] + "\"");
		}
	}
}
