public class floydTriangle {

    static void printFloydTriangle(int n) {

        int i, j, val = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(val++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFloydTriangle(6);
    }
}
