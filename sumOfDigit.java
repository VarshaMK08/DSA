public class sumOfDigit {
    public static int sumDemo(int n) {
        int s = 0;
        while (n > 0) {
            int d = n % 10;
            s += d;
            n /= 10;
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 012340;
        System.out.println(sumDemo(n));
    }
}
