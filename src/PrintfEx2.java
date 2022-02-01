public class PrintfEx2 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";

        float f1 = .10f; // 0.10, 1.0e-1
        float f2 = 1e1f; // 10.0, 1.0eq, 1.0e+1
        float f3 = 3.14e3f;
        double d = 1.234456789;

        System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);

    }
}
