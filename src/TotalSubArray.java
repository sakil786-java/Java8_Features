import java.util.Scanner;

public class TotalSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        subArrayInArray(a);
    }

    private static void subArrayInArray(int[] a) {

        int totalSubArray=0;
        for(int i=0;i<=a.length;i++)
        {
            int start=i;
            for(int j=i;j<a.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(a[k]+" ");

                }
                totalSubArray++;
                System.out.println();

            }

        }
        System.out.println( "Total SubArray: "+totalSubArray);

    }
}
