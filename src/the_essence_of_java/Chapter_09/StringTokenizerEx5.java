package the_essence_of_java.Chapter_09;

import java.util.*;

class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";

		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");

		for(int i=0; i < result.length;i++)
			System.out.print(result[i]+"|");

		System.out.println("길이:"+result.length);

		int i=0;
		for(;st.hasMoreTokens();i++)
			System.out.print(st.nextToken()+"|");

		System.out.println("결과:"+i);
	} // main
}