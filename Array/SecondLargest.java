package Array;

public class SecondLargest {

    public static int seclar(int arr[]) {
        int fl = -1;
        int sl = -1;

        for (int num : arr) {
            if (num > fl) {
                sl = fl;
                fl = num;
            } else if (num > sl && num != fl) {
                sl = num;
            }
        }
        return sl;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 23, 54, 62, 0 };
        System.out.println("the second largest number is " + seclar(arr));
    }
}