import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
       ArrayList<String> fruit= new ArrayList<>();
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

    }
}
