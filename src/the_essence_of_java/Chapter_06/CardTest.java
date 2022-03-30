package the_essence_of_java.Chapter_06;

class CardTest{
	public static void main(String args[]) {
		System.out.println("Card.width = "  + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );		

		System.out.println("c1�� width�� height�� ���� 50, 80���� �����մϴ�.");
		c1.width = 50;
		c1.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")" );
	}
 }

class Card {
	String kind ;				// 카드의 무늬 - 인스턴스 변수
	int number;				     // 카드의 숫자 - 인스턴스 변수
	static int width = 100;		// 카드의 폭  - 클래스 변수
	static int height = 250;	// 카드의 높이 - 클래스 변수
}
