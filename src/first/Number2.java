package first;

public class Number2 {
    public static void main(String[] args) {
        float floatNumber = 1.2f;
        double doubleNumber = 4.3;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum); // java가 실수형 타입 연산을 정확하게 세밀하게 하지 못함을 의마한다(정확성을 위해서는 정수형 쓰기)
    }
}
