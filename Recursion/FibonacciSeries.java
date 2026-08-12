package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fib(int x) {
        if (x == 0)
            return 0;
        if (x == 1 || x == 2)
            return 1;
        else
            return fib(x - 1) + fib(x - 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        sc.close();
    }
}