package Recursion;

import java.util.Scanner;

public class FactorialOfNumber {

    public static int Fact(int x) {
        if (x == 0)
            return 1;
        else
            return x * Fact(x - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
        int y = Fact(n);
        System.out.println("Factorial of the " + n + " is " + y);
        sc.close();
    }
}