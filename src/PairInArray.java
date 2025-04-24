import java.util.Scanner;

public class PairInArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


        pairInArray(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    private static void pairInArray(int[] a) {
        int totalPair=0;
        for(int i=0;i<a.length;i++)
        {
            int current=a[i];
            for(int j=i+1;j<a.length;j++)
            {
                System.out.print("("+current+","+a[j]+")");
                totalPair++;
            }
            System.out.println();
        }
        System.out.println(totalPair);
    }
}
