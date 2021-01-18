
public class LinearSearchRecursion {
	static int rec_linear_search(int arr[], int left, int right, int x) 
	{
	  int result;
	  if (right < left)       
	    return -1;
	  if (arr[left] == x)       
	    return left;
	 
	  result = rec_linear_search(arr, left+1, right, x);     
	  return result;    
	}
	  public static void main(String[] args)
	  {
	    int loc,x,array[]={10,11,12,13,14,25,26,37,48,29};
	    x=13;    
	    loc = rec_linear_search(array, 0, 10, x);    
	    if(loc != -1)
	      System.out.print("Element found at location : " + loc);
	    else
	      System.out.print("Element not present in the array.");
	  }
}
