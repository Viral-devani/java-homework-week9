package homework_week9;
/*
Write the programme that tell you which line pass through particular stations.
Just use Zone 1 stations name.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Program10TubeStation {

    public static void main(String[] args) {
        Program10TubeStation obj = new Program10TubeStation();
        obj.tubestation();

    }

    public void tubestation() {
        ArrayList<String> station = new ArrayList<>();
        station.add("LondonBridge");
        station.add("Bank");
        station.add("BakerStreet");
        station.add("BondStreet");
        station.add("Oxfordcircus");
        station.add("Paddington");
        station.add("Westminister");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zone 1 stations names are : " + station);
        System.out.println("____________________________________________________________________________________________");


        System.out.println("Enter any Station name :");
        String station1 = scanner.next();


        switch (station1) {
            case "londonbridge":
                System.out.println("Lines Pass throgh LondonBridge :   Northern line and Jubilee");
                break;
            case "bank":
                System.out.println("Lines pass through Bank : Northerline,District line and Central line ");
                break;
            case "bakerstreet":
                System.out.println("Line pass through Bakerstreet : Metropoliton,Centrol line,Hemmersmith and city");
                break;
            case "bondstreet":
                System.out.println("Line pass throgh Bond Street :Jubilee line,Central line,Elizabeth line");
                break;
            case "oxfordcircus":
                System.out.println("Line pass through Oxford Circus : Central line,Northern line,Elizabeth line.");
                break;
            case "paddington":
                System.out.println("Line pass through Paddigton :Circle line,District line,Elizabeth line,Hemmersmith and city,Bakerloo line ");
                break;
            case "westminister":
                System.out.println("Line pass through Westminister : Jubilee line, Northernline,Bakerloo line ");
                break;
            default:
                System.out.println("Invalid Station name ");
        }


    }


}

