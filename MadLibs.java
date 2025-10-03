import java.util.Scanner; // Imports java scanner 

public class MadLibs {
  public static void main(String[] args) { // Starts a Public Class
    Scanner in = new Scanner(System.in); // Starting a Scanner 

    System.out.print("Enter an animal (protagonist): ");
    String a1 = in.nextLine(); // Starts the story and ask for a protagnist 

    System.out.print("Enter a place (singular): "); // Input a place 
    String place = in.nextLine();

    System.out.print("Enter another animal (the one being asked the time): "); //  Input a another animal other than the protagnist
    String animal2 = in.nextLine();


    System.out.print("Enter a person's name: "); // Enter the Persons Name
    String person = in.nextLine();

    System.out.print("Enter a verb (base form): "); // Add a verb 
    String verb = in.nextLine();

    System.out.print("Enter an object: "); // Enter a object 
    String object1 = in.nextLine();

    System.out.print("Enter a vehicle: "); // enter  vehicle 
    String vehicle = in.nextLine();

    System.out.print("Enter an adjective: "); // Enter a adjective 
    String adjective1 = in.nextLine();

    System.out.print("Enter a creature: "); // Enter the Creature 
    String creature = in.nextLine();

    System.out.print("Enter a funny phrase: "); // Enter a funny phase 
    String funnyPhrase = in.nextLine();

    System.out.print("Enter places (plural): "); // Enter places 
    String placesPlural = in.nextLine();

    System.out.print("Enter a plural noun: "); // Enter a Plural Noun 
    String pluralNoun = in.nextLine();

    System.out.print("Enter another adjective: "); // Enter a Adjective 
    String adjective2 = in.nextLine();

    System.out.print("Enter another object: ");  // Enter object
    String object2 = in.nextLine();

    System.out.print("Enter a color: "); //Enter Color RGB ect
    String color1 = in.nextLine();

    System.out.print("Enter a silly noun: "); // Enter  Silly noun 
    String sillyNoun = in.nextLine();

    System.out.print("Enter a time (e.g., 12:34): "); // Enter time 
    String time = in.nextLine();

    System.out.print("Enter another color: "); // Enter colors
    String color2 = in.nextLine();

    String responseTime = subtractMinutes(time, 9); // Starts the Madlib 
/* Starts the MadLib and uses the string and fills in the madlibs up because it has information from above to fill it up
*/
    System.out.println();
    System.out.println("--- Your MadLibs Story ---");
    System.out.println("One day a"  + " " + a1 + " walked into a"  + " " + place + ".");
    System.out.println("He then asked a"  + " " + animal2 + " " + "what was the time.");
    System.out.println("The " + animal2 + " " + "responded " + responseTime + ".");
    System.out.println("This meant " + person + " had 9 minutes left before he " + verb + ".");
    System.out.println();
    System.out.println("Panicking, the" + " " + a1 + " grabbed a " + object1 + " and ran toward the " + vehicle + " parked outside.");
    System.out.println("Along the way, a" + " " + adjective1 + " " + creature + " tried to stop him by yelling, \"" + funnyPhrase + "!\"");
    System.out.println("But there was no time to waste.");
    System.out.println();
    System.out.println("He sprinted past the" + " " + placesPlural + ", through a crowd of " + pluralNoun + ", and into the " + adjective2 + " building.");
    System.out.println("Inside, he found a " + object2 + " glowing with a " + color1 + " light.");
    System.out.println("Picking it up, he realized it was the key to saving" + " "  + sillyNoun + ".");
    System.out.println();
    System.out.println("With only seconds left, the" + " "  + a1 + " shouted to " + person + ", \"We must " + verb + " before it’s too late!\"");
    System.out.println("The clock struck" + " "  + time + ", and suddenly everything turned" + " "  + color2 + ".");

    in.close();
  }

  public static String subtractMinutes(String timeStr, int minutesToSubtract) { 
    try {
      String[] parts = timeStr.split(":");
      int hours = Integer.parseInt(parts[0]);
      int minutes = Integer.parseInt(parts[1]);
      
      minutes -= minutesToSubtract;
      
      if (minutes < 0) {
        minutes += 60;
        hours -= 1;
      }
      
      if (hours < 0) {
        hours += 24;
      }
      
      return String.format("%d:%02d", hours, minutes);
    } catch (Exception e) {
      return timeStr;
    }
  }
}
