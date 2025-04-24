package Array;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 2;
        rightRotateArrayBYBruteforce(a, d);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int[] x = {1, 2, 3, 4, 5};
        rightRotateArrayBYOptimal(x, d);
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }

    }

    private static void rightRotateArrayBYOptimal(int[] a, int d) {
        int n = a.length;
        d = d % n;

        reverseArray(a, 0, n - d - 1);
        reverseArray(a, n - d, n - 1);
        reverseArray(a, 0, n - 1);
    }

    private static void reverseArray(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    private static void rightRotateArrayBYBruteforce(int[] a, int d) {
        int n = a.length;
        d = d % n;

        for (int i = 0; i < d; i++) {
            int last = a[n - 1];
            for (int j = n - 1; j > 0; j--) {
                a[j] = a[j - 1];
            }
            a[0] = last;
        }
    }
}
