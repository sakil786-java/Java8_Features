import java.util.Scanner;

public class MaxSumOfASubArray_PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        maxSumOfASubArray(a);
        maxSumOfASubArray_PrefixSum(a);
        maxSumOfASubArray_Kadanes(a);
    }

    private static void maxSumOfASubArray_Kadanes(int[] a) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for (int i = 0; i < a.length; i++) {
            currentSum = currentSum + a[i];
            maxSum = Math.max(currentSum, maxSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        System.out.println("Kadanes: " + maxSum);
    }

    private static void maxSumOfASubArray(int[] a) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length; i++) {
            int start = i;
            for (int j = i; j < a.length; j++) {
                int end = j;
                currentSum = 0;
                for (int k = start; k <= end; k++) {
                    currentSum = currentSum + a[k];

                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                // System.out.println();
                // System.out.println(currentSum);
            }

        }
        System.out.println("Max Sum of a  SubArray: " + maxSum);

    }

    private static void maxSumOfASubArray_PrefixSum(int[] a) {
        int[] prefix = new int[a.length];
        prefix[0] = a[0];
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (i == 0) {
                    currentSum = prefix[j];
                } else {
                    currentSum = prefix[j] - prefix[i - 1];
                }
                if (maxSum < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("MaxSum Prefix " + maxSum);
    }

}
