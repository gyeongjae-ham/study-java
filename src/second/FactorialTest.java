package second;

public class FactorialTest {
    public static void main(String[] args) {
        int result = facotrial(4);

        System.out.println(result);
    }

    static int facotrial(int n) {
        int result = 0;

        if(n <= 0 || n > 12) return -1; // 매개변수 n의 유효성 검사 추가
        if (n == 1) {
            result = 1;
        } else {
            result = n * facotrial(n - 1);
        }

        return result;
    }
}