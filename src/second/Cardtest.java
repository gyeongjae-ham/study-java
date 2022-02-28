package second;

class Card {
    String kind; // 무늬 인스턴스 변수
    int number; // 숫자 인스턴스 변수

    static int width = 100; // 폭 클래스 변수
    static int height = 250; // 높이 클래스 변수
}
public class Cardtest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        // 클래스 변수(static 변수)는 객체생성 없이 '클래스 이름.클래스 변수'로 직접 사용 가능하다.

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;
        // 인스턴스 변수의 값을 변경한다.

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");
        c1.width = 50;
        c1.height = 80;
        // 클래스 변수의 값을 변경한다.

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");

        // 클래스 변수를 사용할 때는 Card.width와 같은 형태로 하는 것이 좋다
        // 인스턴스를 통해서도 클래스 변수를 사용할 수 잇지만 그렇게 하면 클래스 변수를 인스턴스변수로 오해할 수도 있기 때문이다.
    }
}
