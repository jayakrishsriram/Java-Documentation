import java.util.Map;
import java.util.HashMap;
public class map {
    

public static void main(String[] args) {
    Map<String, Integer> cars = new HashMap<>();
    cars.put("Bmw", 3);
    cars.put("Audi", 2);
    cars.put("Mercedes", 5);
    cars.put("Honda", 7);
    cars.put("Mustang", 1);
    System.out.println(cars);
    cars.remove("Bmw");
    System.out.println(cars.size());
    System.out.println(cars.get("Audi"));
    }
    
    
}

