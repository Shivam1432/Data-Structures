import java.util.Scanner;
public class Insertion2 {
    public static void main(String[] args) {
        /*Inserting element before given index in array */
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a[]=new int[n+1];
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
       int pos,ele;
       pos=sc.nextInt();
       ele=sc.nextInt();
       for(int i=(n-1);i>=(pos-1);i--)
       {
           a[i+1]=a[i];
       }
       a[pos-1]=ele;
       for(int i=0;i<n+1;i++)
       {
           System.out.print(a[i]+ " ");
       }
       sc.close();
   }
}
