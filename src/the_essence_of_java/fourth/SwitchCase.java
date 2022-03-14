package the_essence_of_java.fourth;

public class SwitchCase {
    public static void main(String[] args) {
        int month = 5;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("일치하는 값 없음");
        }
    }
}
