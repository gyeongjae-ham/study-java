package the_essence_of_java.second;

import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        String a = "치킨";
        Scanner scanner = new Scanner(System.in);
        String b = scanner.nextLine();

        System.out.println(a.equals(b)); // true java에서 스트링 값 비교할 때 저장된 위치를 비교함
        System.out.println(a == b); // false 그래서 ==으로 하면 각기 다른 장소에 입력된 값이라서 false 나옴
    }
}
