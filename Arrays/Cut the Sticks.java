import java.util.Scanner;
import java.util.*;
public class CutSticks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         int n,i,count=0,least;
         n=s.nextInt();
         int arr[]=new int[n];
         for(i=0;i<n;i++)
         {
        	 arr[i]=s.nextInt();
         }
         while(min(arr,n)!=0)
         {
        	 count=0;
        	 least=min(arr,n);
        	 for(i=0;i<n;i++)
        	 {
        		 if(arr[i]!=0)
        		 {
        			 arr[i]=arr[i]-least;
        			 count++;
        		 }
        	 }
        	 System.out.print(count+" ");
         }
        s.close();
	}
	public static int min(int[] arr,int n)
    {
		int sm=100000,i,flag=0;
		for(i=0;i<n;i++)
		{
			if(arr[i]!=0) {
				flag=1;
				if(sm>arr[i]) {
					sm=arr[i];
				}
			}
		}
		if(flag==1)
			return sm;
		else
			return 0;
	}
}
