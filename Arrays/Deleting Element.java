import java.util.Scanner;
import java.util.Arrays;
public class DeletingElement {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int search=sc.nextInt();
        int j=Arrays.binarySearch(a, search);
        sc.close();
        if(j>=0 && j<n)
        {
            for(int i = j; i < a.length -1; i++)
            {
                a[i] = a[i + 1];
            }
            n--;
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
