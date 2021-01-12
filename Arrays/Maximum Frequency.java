import java.util.Arrays;
import java.util.Scanner;
public class MaxFrequency {
	static int mostFrequent(int arr[], int n) 
    { 
        Arrays.sort(arr); 
 
        int max_count = 1, res = arr[0]; 
        int curr_count = 1; 
          
        for (int i = 1; i < n; i++) 
        { 
            if (arr[i] == arr[i - 1]) 
                curr_count++; 
            else 
            { 
                if (curr_count > max_count) 
                { 
                    max_count = curr_count; 
                    res = arr[i - 1]; 
                } 
                curr_count = 1; 
            } 
        } 
        if (curr_count > max_count) 
        { 
            max_count = curr_count; 
            res = arr[n - 1]; 
        } 
      
        return res; 
    } 
      
    public static void main (String[] args) { 
        Scanner sc=new Scanner(System.in);  
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
        	arr[i]=sc.nextInt();
        } 
        sc.close();  
        System.out.println(mostFrequent(arr,n)); 
          
    } 
}
