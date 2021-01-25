import java.util.Scanner;

public class QuickSort {
    public void quickSort(int a[],int s,int e)
    {
    	int pi;
    	if(s>=e)
    	{
    		return;
    	}
    	else
    	{
    		pi=partition(a,s,e);
    		quickSort(a,s,pi-1);
    		quickSort(a,pi+1,e);
    	}
    }
    public static int partition(int a[],int s,int e)
    {
    	int pivot=a[e];
    	int i=(s-1);
    	for(int j=s;j<=e-1;j++)
    	{
    		if(a[j]<pivot)
    		{
    			i++;
    			int temp = a[i]; 
                a[i] = a[j]; 
                a[j] = temp;
    		}
    	}
    	int temp = a[i+1]; 
        a[i+1] = a[e]; 
        a[e] = temp;
    	return (i+1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	a[i]=s.nextInt();
        }
        QuickSort obj=new QuickSort();
        obj.quickSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        s.close();  
	}

}
