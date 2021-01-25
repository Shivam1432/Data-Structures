import java.util.Scanner;

public class MergeSort {
    public void mergeSort(int a[],int s,int e)
    {
    	if(s>=e)
    	{
    		return;
    	}
    	else
    	{
    		int mid=(s+e)/2;
    		mergeSort(a,s,mid);
    		mergeSort(a,mid+1,e);
    		
    		merge(a,s,e);
    	}
    }
    public static void merge(int a[],int s,int e)
    {
    	int mid=(s+e)/2;
    	
    	int i=s;
    	int j=mid+1;
    	int k=s;
    	int n=s+e+1;
    	
    	int temp[]=new int[n];
    	
    	while(i<=mid && j<=e)
    	{
    		if(a[i]<a[j])
    		{
    			temp[k++]=a[i++];
    		}
    		else
    		{
    			temp[k++]=a[j++];
    		}
    	}
    	while(i<=mid)
    	{
    		temp[k++]=a[i++];
    	}
    	while(j<=e)
    	{
    		temp[k++]=a[j++];
    	}
    	for(int l=s;l<=e;l++)
    	{
    		a[l]=temp[l];
    	}
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
        MergeSort obj=new MergeSort();
        obj.mergeSort(a,0,n-1);
        for(int i=0;i<n;i++)
        {
        	System.out.print(a[i]+" ");
        }
        s.close();
	}

}
