package first;

public class FunctionExample {
    public static void main(String[] args) {
        sayHello();
        sayHelloTo("chicken");
        printSum(3, 5);
        int result = sum(2, 4);
        System.out.println(result);

        int[] sumAndProduct = addAndMultiply(2, 3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);

        boolean saidHola = sayHola("바보");
    }

    public static boolean sayHola(String name) {
        if (name.equals("바보")) {
            System.out.println("바르고 고운 말을 사용해주세요.");
            return false;
        } else {
            System.out.println(name + "님, 안녕하세요?");
            return true;
        }
    }

    public static int[] addAndMultiply(int a, int b) {
        int sum =  a + b;
        int product = a * b;

        int[] result = {sum, product};

        return result;
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello, " + name);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printSum(int a, int b) {
        System.out.println(a + " + " + b + " = " + sum(a, b));
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
