import java.util.*;
class Result
{
  static void findMedians(int a[], int n)
  {
	int med = a[0]; 
          
        // max heap to store the smaller half elements  
        PriorityQueue<Integer> smaller = new PriorityQueue<> 
        (Collections.reverseOrder()); 
          
        // min-heap to store the greater half elements  
        PriorityQueue<Integer> greater = new PriorityQueue<>(); 
          
        smaller.add(a[0]); 
        System.out.print(med+ " "); 
        
        for(int i = 1; i < n; i++) 
        { 
              
            int x = a[i]; 
              
            // case1(left side heap has more elements)  
            if(smaller.size() > greater.size()) 
            { 
                if(x < med) 
                { 
                    greater.add(smaller.remove()); 
                    smaller.add(x); 
                } 
                else
                    greater.add(x); 
                med = (smaller.peek() + greater.peek())/2; 
            } 
              
            // case2(both heaps are balanced)  
            else if(smaller.size() == greater.size()) 
            { 
                if(x < med) 
                { 
                    smaller.add(x); 
                    med = smaller.peek(); 
                } 
                else
                { 
                    greater.add(x); 
                    med = greater.peek(); 
                } 
            } 
              
            // case3(right side heap has more elements)  
            else
            { 
                if(x > med) 
                { 
                    smaller.add(greater.remove()); 
                    greater.add(x); 
                } 
                else
                    smaller.add(x); 
                med = (smaller.peek() + greater.peek())/2; 
                  
            } 
            System.out.print(med+" "); 
        }
  }
}
