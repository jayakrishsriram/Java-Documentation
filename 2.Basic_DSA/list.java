import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class list {
    public static void main(String[] args) {
       List<String> fruit= new ArrayList<>();
       fruit.add("Apple");
       fruit.add("Banana");
       fruit.add("Water melon");
       int l=fruit.size();
       System.out.println(l);
       System.out.println(fruit);
       String a= fruit.get(2);
       System.out.println(a);
       fruit.set(1, "Green Banana");  // set(index, element)- index --> at what position we want to change the element, Element--> changed element
       System.out.println(fruit);
       fruit.remove(1); //index of the element to be removed
       System.out.println(fruit);
       fruit.clear();// To remove all the element
       System.out.println(fruit);
       List<String> linkedList = new LinkedList<>();
       linkedList.add("Cherry");
       linkedList.add("Date");
       System.out.println(linkedList); // Output: [Cherry, Date]
       Vector<String> vector = new Vector<String>();
       vector.add("Elderberry");
       vector.add("Fig");
       System.out.println(vector); // Output: [Elderberry, Fig]
       Stack<String> stack = new Stack<>();
       stack.push("Grapes");
       stack.push("Honeydew");
       System.out.println(stack.pop()); // Output: Honeydew
       System.out.println(stack);       // Output: [Grapes]
    }
}
