package homework_week9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Write a Java program to iterate through all elements in an array list using Iterator
 */
public class Program5ArrayUsingIterator {
    public static void main(String[] args) {
        Program5ArrayUsingIterator obj=new Program5ArrayUsingIterator();
        obj.arraymethod();

    }

    public void arraymethod() {
        Set<Integer> list = new HashSet();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


    }
}
