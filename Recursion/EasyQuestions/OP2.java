package Recursion.EasyQuestions;

public class OP2 {

    static int fun1(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + fun1(n / 2);
    }

    // Driver code
    public static void main(String[] args) {
        System.out.println(fun1(8));
    }
}