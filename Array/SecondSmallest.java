package Array;

public class SecondSmallest {

    public static int secsma(int arr[]) {
        int fs = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < fs) {
                ss = fs;
                fs = num;
            } else if (num < ss && num != fs) {
                ss = num;
            }
        }
        if (ss == Integer.MAX_VALUE) {
            System.out.println("Second smallest not present");
        } else {
            System.out.println("Smallest " + fs);
            System.out.println("Second Smallest " + ss);
        }
        return ss;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 23, 4, 62, 0 };
        secsma(arr);
    }
}