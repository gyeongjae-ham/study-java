package the_essence_of_java.second;

public class StringExample {
    public static void main(String[] args) {
        System.out.println("나는 문자열");
        System.out.println('나');

        System.out.println("안녕 나는 \"자바\"야.");

        System.out.println("치킨은 살 안 쪄요.\n살은 내가 쪄요.");

        String chicken = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";

        String chickenAndMe =  chicken + me; // 문자열 더하기
        System.out.println(chickenAndMe);
        int length = me.length(); // 문자열 길이
        System.out.println(length);

        // 문자열 바꾸기
        System.out.println(me.replaceAll("내가", "치킨이"));

        // 문자열 자르기
        String birthday = "1970/01/01";
        String year = birthday.substring(0, 4);
        String day = birthday.substring(8);
        System.out.println(year);
        System.out.println(day);
    }
}
