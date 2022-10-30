package homework_week9;
/*
Write a “main” method into main class. It has scanner that takes user input.
 Also write the logic that it ask user to “Enter first Number:”,
 “Enter second Number:” “Please enter one of symbol +,-,*, /:”
  if user enter + symbol result like “Addition of 5 and 10 is: 15” and respective for other symbol.
 */
import java.util.ArrayList;

/*
Write a Java program to create a new array list, add some colours (string)
and printout the collection using for each loop.
 */
public class Program4ArrayList {
    public static void main(String[] args) {
        Program4ArrayList obj=new Program4ArrayList();
        obj.colourlist();


    }
    public void colourlist(){
        ArrayList<String>colour=new ArrayList();
        colour.add("Red");
        colour.add("Yellow");
        colour.add("Black");
        colour.add("Pink");
        colour.add("Purple");

        for (String colorlist:colour) {
            System.out.println(colorlist);
        }

    }
}
