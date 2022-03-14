package the_essence_of_java.second;

public class Number {
    public static void main(String[] args) {
        byte byteInteger = 10;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;

        System.out.println(byteInteger);
        System.out.println(shortInteger);
        System.out.println(intInteger);
        System.out.println(longInteger);

        int sum = byteInteger + shortInteger;
        int sum2 = shortInteger + intInteger;
        long sum3 = intInteger + longInteger;
        long sum4 = byteInteger + longInteger;
    }
}
