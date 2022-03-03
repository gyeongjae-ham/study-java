package chapter.second;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (NumberFormatException e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
