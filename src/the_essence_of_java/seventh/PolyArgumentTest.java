package the_essence_of_java.seventh;

import java.util.Vector;

class Product {
    int price; // 제품의 가격
    int bonusPoint; // 제품 구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0); // 보너스 점수는 제품 가격의 10%
    }
}

class OledTv extends Product {
    OledTv() {
        // 부모 클래스의 생성자 Product(int price)를 호출
        super(100); // Tv 가격 100만원
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); // 구입한 제품을 저장하기 위한 배열, but 10개 이상 제품을 구입할 수 없는 문제
    // Vector 클래스를 이용하면 된다. Vector 클래스는 배열의 크기를 알아서 관리해 준다
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p); // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void refund(Product p) {
        if (item.remove(p)) { // 구입한 제품 환불한다
            money += p.price; // 제품을 Vector에서 제거한다
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else { // 제거에 실패한 경우
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary() { // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0; // 구매한 물품의 가격 합계
        String itemList = ""; // 구매한 물품목록

        if (item.isEmpty()) {
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }
        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.

        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i); // Vector의 i번째 있는 객체를 얻어온다.
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }


}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        OledTv tv = new OledTv();
        Computer com = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
