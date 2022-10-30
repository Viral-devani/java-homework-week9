package homework_week9;

import java.util.ArrayList;

/*
Write a Java program to test an array list is empty or not.
Define array list with underground tube names
 */
public class Program7ArrayListEmpty {
    public static void main(String[] args) {
        arraylistEmpty();

    }
    public static void arraylistEmpty(){
        ArrayList<String>tubename=new ArrayList();
        tubename.add("Jubilee");
        tubename.add("Bakerloo");
        tubename.add("Northern");
        tubename.add("Victoria");
        tubename.add("Central");
        tubename.add("Waterloo");

        if(tubename.isEmpty()) {
            System.out.println(tubename.isEmpty());//if empty return true
            System.out.println("The arraylist is empty");
        }else {
            System.out.println(tubename.isEmpty());//if not empty return false
            System.out.println("The Arraylist is not empty");
        }
        System.out.println("-----------------------------------------");
        System.out.println("Arraylist tubename :\n"+tubename);

    }
}
