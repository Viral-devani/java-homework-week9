package homework_week9;
//Write a Java program to retrieve an element (at a specified index) from a given array list
import java.util.ArrayList;

public class Program6RetriveElement {

    public static void main(String[] args) {
        Program6RetriveElement obj = new Program6RetriveElement();
        obj.retrieveElement();
    }

    public void retrieveElement() {
        ArrayList<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        System.out.println("Original Days list :\n" + days);
        System.out.println("====================================================");

        String element = days.get(1);//Retrieve sencond element
        System.out.println("Second element : " + element);

        element = days.get(4);//Retrieve fifth element
        System.out.println("Fifth element : " + element);
    }

}
