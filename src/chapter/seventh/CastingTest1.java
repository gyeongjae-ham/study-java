package chapter.seventh;

public class CastingTest1 {
    public static void main(String[] args) {
        CarCasting car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; // car = (CarCasting)fe; 에서 형변환이 생략된 형태
//        car.water() 컴파일 에러가 뜬다. 형변환돼서 CarCasting의 참조변수이므로 자식 클래스의 메서드를 사용할 수 없기 때문
        fe2 = (FireEngine) car; // 조상타입 -> 자식타입
        fe2.water();
    }
}

class CarCasting {
    String color;
    int door;

    void drive() {
        System.out.println("drive, Brrrr~");
    }

    void stop() {
        System.out.println("stop!!!");
    }
}

class FireEngine extends CarCasting {
    void water() {
        System.out.println("water!!");
    }
}
