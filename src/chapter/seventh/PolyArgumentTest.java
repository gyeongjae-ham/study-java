package chapter.seventh;

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

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] item = new Product[10]; // 구입한 제품을 저장하기 위한 배열, but 10개 이상 제품을 구입할 수 없는 문제
    // Vector 클래스를 이용하면 된다. Vector 클래스는 배열의 크기를 알아서 관리해 준다
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[i++] = p; // 제품을 Product[] item에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new OledTv());
        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
    }
}
