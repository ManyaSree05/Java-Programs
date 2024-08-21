public class SubMethod {
    public static int sub(int x, int y) {
        int z = x - y;
        return z;
    }

    public static void main(String[] args) {
        int a = 25;
        int b = 7;
        int c = sub(a, b);
        System.out.println("Difference = " + c);
    }
}
