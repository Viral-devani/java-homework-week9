package homework_week9;

import java.util.HashMap;
import java.util.Map;

/*
Create a HashMap object called people
that will store String keys and Integer values:
And use for each loop to iterate the value from Map.
 */
public class Program9HashMap {
    public static void main(String[] args) {
        Program9HashMap obj = new Program9HashMap();
        obj.hashMapMethod();

    }

    public void hashMapMethod() {

        Map<Integer, String> people = new HashMap<>();
        people.put(1, "Ajay");
        people.put(2, "Disha");
        people.put(3, "Vaibhavi");
        people.put(4, "Himesh");

        for (Map.Entry<Integer, String> peopleName : people.entrySet()) {
            System.out.println(peopleName);
        }


    }
}
