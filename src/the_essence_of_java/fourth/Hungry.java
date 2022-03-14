package the_essence_of_java.fourth;

public class Hungry {
    public static void main(String[] args) {
        int money = 5500;

        if (money >= 8000) {
            System.out.println("순대국 마이쪙!!");
        } else if (money >= 5000) {
            System.out.println("스테이크 마이쪙!");
        } else {
            System.out.println("흑흑흑. 배고프다.");
        }
    }
}
