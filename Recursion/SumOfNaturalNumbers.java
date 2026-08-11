package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int Sum(int x) {
        if (x == 0)
            return 0;
        else
            return x + Sum(x - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Natural Number");
        int n = sc.nextInt();
        int y = Sum(n);
        System.out.println("The Sum of first " + n + " Natural numbers is " + y);
        sc.close();

    }
}