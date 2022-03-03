package chapter.third;

public class OperatoreEx2 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }

        System.out.println(); // 줄바꿈을 한다

        c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.print(c++);
        }

        System.out.println();

        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(c++);
        }
        System.out.println();
    }
}
