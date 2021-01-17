import java.util.Scanner;
public class Insertion1 {
	public static void main(String[] args) {
        /*Inserting element at beginning of array */
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n+1];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       int ele;
       ele=sc.nextInt();
       for(int i=n-1;i>=0;i--)
       {
           a[i+1]=a[i];
       }
       a[0]=ele;
       for(int i=0;i<n+1;i++)
       {
           System.out.print(a[i]+" ");
       }
       sc.close();
   }
}
