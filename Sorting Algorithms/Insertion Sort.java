import java.util.Scanner;

public class InsertionSort {
    void insertionSort(int arr[],int n)
    {
    	int i,j,value,count=0;
    	for(i=1;i<n;i++)
    	{
    		value=arr[i];
    		for(j=i-1;j>=0 && arr[j]>value;j--)
    		{
    			arr[j+1]=arr[j];
    			count++;
    		}
            arr[j+1]=value;
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
 	   InsertionSort obj=new InsertionSort();
 	   obj.insertionSort(arr,n);
 	   for(int i=0;i<n;i++)
 	   {
 		   System.out.print(arr[i]+" ");
 	   }
 	   s.close();
    }
}
