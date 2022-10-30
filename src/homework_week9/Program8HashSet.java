package homework_week9;
/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set.
(Hint: use for loop and if else)
 */

import java.util.HashSet;

public class Program8HashSet {
    public static void main(String[] args) {
        Program8HashSet obj = new Program8HashSet();
        obj.hashsetMethod();

    }

    public void hashsetMethod() {
        HashSet<Integer> number = new HashSet<>();
        number.add(4);
        number.add(7);
        number.add(8);
        for (int i = 1; i <= 10; i++) {
            if (number.contains(i))
                System.out.println(i + " number is in list ");
            else
                System.out.println(i + " number is not in list ");

        }
    }

}
