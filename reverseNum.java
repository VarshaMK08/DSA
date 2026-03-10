public class reverseNum {
    public static int rev(int n) {
        int r = 0;
        int d;

        while (n > 0) {
            d = n % 10;
            r = r * 10 + d;
            n /= 10;
        }
        return r;
    }

    public static void main(String[] args) {
        int n = 1234560;
        System.out.println(rev(n));
    }
}
