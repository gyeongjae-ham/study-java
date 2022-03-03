package second;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck(); // 카드 한 벌(Deck)을 만든다
        CardInfo c = d.pick(0); // 섞기 전 제일 위의 카드를 뽑는다.
        System.out.println(c); // System.out.println(c.toString()); 과 같다.

        d.shuffle(); // 카드를 섞는다.
        c = d.pick(0); // 섞은 후 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

// Card 클래스
class CardInfo {
    static final int KIND_MAX = 4; // 카드 무늬의 수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    // 숫자 별 카드의 종류를 지정한다.
    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kindOfCard;
    int numberOfKind;

    CardInfo() {
        this(SPADE, 1);
    }

    CardInfo(int kindOfCard, int numberOfKind) {
        this.kindOfCard = kindOfCard;
        this.numberOfKind = numberOfKind;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK";

        return "kind : " + kinds[this.kindOfCard] + ", number : " + numbers.charAt(this.numberOfKind);
    }
} // Card 클래스 종료

class Deck {
    final int CARD_NUM = 52; // 카드의 개수
    CardInfo[] cardArr = new CardInfo[CARD_NUM];

    Deck() {
        int i = 0;

        for (int k = CardInfo.KIND_MAX; k > 0 ; k--) {
            for (int n = 0; n < CardInfo.NUM_MAX; n++) {
                cardArr[i++] = new CardInfo(k, n + 1);
            }
        }
    }

    CardInfo pick(int index) {
        return cardArr[index];
    }

    CardInfo pick() {
        int index = (int) (Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle() {
        for (int i = 0; i < cardArr.length; i++) {
            int r = (int) (Math.random() * CARD_NUM);

            CardInfo temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

