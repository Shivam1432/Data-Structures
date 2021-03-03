/* class Node {
  int data;
  Node next;
  Node() {}
  Node(int d) {
    data=d;
  }
} */
import java.util.*;
class Result {
  static Node findMergePoint(Node n1, Node n2) {
HashSet<Node> hs = new HashSet<Node>(); 
        while (n1 != null) { 
            hs.add(n1); 
            n1 = n1.next; 
        } 
        while (n2 != null) { 
            if (hs.contains(n2)) { 
                return n2; 
            } 
            n2 = n2.next; 
        } 
        return null; 
  }
}
