import java.util.Scanner;
public class SelectionSort {
   void selectionSort(int arr[],int n)
   {
	   int i,T,j,min,count=0;
	   for(i=0;i<n;i++)
	   {
		   min=i;
		   for(j=i+1;j<n;j++)
		   {
			   if(arr[j]<arr[min])
			   {
				   min=j;
				   count++;
			   }
		   }
		   if(min!=i)
		   {
			   T=arr[min];
			   arr[min]=arr[i];
			   arr[i]=T;  
		   }
	   }
	   System.out.println("Comparisons: "+count);
   }
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   int n=s.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   SelectionSort obj=new SelectionSort();
	   obj.selectionSort(arr,n);
	   for(int i=0;i<n;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   s.close();
   }
}
