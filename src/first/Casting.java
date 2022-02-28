package first;

public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1; // 정수지만 double형의 변수에 담길 때 1.0으로 컨버팅 됨
        System.out.println(b);

//      int c = 1.1; // double형을 int형으로 바꿀수는 없음
        double d = 1.1;
        int e = (int) 1.1;
        System.out.println(e);

        // 1 integer to string casting
        String f = Integer.toString(1);
        System.out.println(f.getClass());
    }
}
