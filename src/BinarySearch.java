import java.util.Scanner;

public class BinarySearch {
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
        int searchIndex=binarySearch(a,key);
        System.out.println(searchIndex);

        reverseAnArray(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

    }

    private static void reverseAnArray(int[] a) {
        int first=0;
        int last=a.length-1;
        while (first<last)
        {
           int t= a[first];
            a[first]=a[last];
           a[last]=t;
           first++;
           last--;
        }
    }

    private static int binarySearch(int[] a,int key) {
        int start=a[0];
        int last=a.length-1;

        while (start<=last)
        {
            int mid=(start+last)/2;
            if(a[mid]==key)
            {
                return mid;
            }
            else if(a[mid]<key)// search right
            {
               start=mid+1;
            }
            else {
                last=mid-1;
            }
        }
        return -1;
    }
}
