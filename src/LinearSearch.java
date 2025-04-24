import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Key: ");
        int key=sc.nextInt();
        int store=-1;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                store=i;
                break;

            }
        }
        System.out.println(store);
    }
}
