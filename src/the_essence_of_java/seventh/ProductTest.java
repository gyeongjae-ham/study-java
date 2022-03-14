package the_essence_of_java.seventh;

class ProductInfo {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public ProductInfo() {} // 기본 생성자, 생략 가능
}

public class ProductTest {
    public static void main(String[] args) {
        ProductInfo p1 = new ProductInfo();
        ProductInfo p2 = new ProductInfo();
        ProductInfo p3 = new ProductInfo();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("생산된 제품의 수는 모두 " + ProductInfo.count + "개 입니다.");
    }
}
