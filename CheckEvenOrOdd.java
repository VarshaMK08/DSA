public class CheckEvenOrOdd {
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 10;
        if (isEven(n) == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}