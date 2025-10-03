import java.util.Scanner; // Imports Scanner class for user input

public class MadLibs {
  public static void main(String[] args) { // Main method - entry point of the program
    Scanner in = new Scanner(System.in); // Create a Scanner object for input

    // Collect user inputs for the MadLibs story
    System.out.print("Enter an animal (protagonist): ");
    String a1 = in.nextLine(); // Protagonist animal

    System.out.print("Enter a place (singular): ");
    String place = in.nextLine(); // A place

    System.out.print("Enter another animal (the one being asked the time): ");
    String animal2 = in.nextLine(); // Another animal

    System.out.print("Enter a person's name: ");
    String person = in.nextLine(); // A person's name

    System.out.print("Enter a verb (base form): ");
    String verb = in.nextLine(); // Verb

    System.out.print("Enter an object: ");
    String object1 = in.nextLine(); // An object

    System.out.print("Enter a vehicle: ");
    String vehicle = in.nextLine(); // Vehicle

    System.out.print("Enter an adjective: ");
    String adjective1 = in.nextLine(); // Adjective

    System.out.print("Enter a creature: ");
    String creature = in.nextLine(); // Creature

    System.out.print("Enter a funny phrase: ");
    String funnyPhrase = in.nextLine(); // Funny phrase

    System.out.print("Enter places (plural): ");
    String placesPlural = in.nextLine(); // Places (plural)

    System.out.print("Enter a plural noun: ");
    String pluralNoun = in.nextLine(); // Plural noun

    System.out.print("Enter another adjective: ");
    String adjective2 = in.nextLine(); // Another adjective

    System.out.print("Enter another object: ");
    String object2 = in.nextLine(); // Another object

    System.out.print("Enter a color: ");
    String color1 = in.nextLine(); // A color

    System.out.print("Enter a silly noun: ");
    String sillyNoun = in.nextLine(); // Silly noun

    System.out.print("Enter a time (e.g., 12:34): ");
    String time = in.nextLine(); // A time 

    System.out.print("Enter another color: ");
    String color2 = in.nextLine(); // Another color

    // Adjusts the given time by subtracting 9 minutes
    String responseTime = subtractMinutes(time, 9); 

    // --- Start of the generated MadLibs story ---
    System.out.println();
    System.out.println("--- Your MadLibs Story ---");
    System.out.println("One day a " + a1 + " walked into a " + place + ".");
    System.out.println("He then asked a " + animal2 + " what was the time.");
    System.out.println("The " + animal2 + " responded " + responseTime + ".");
    System.out.println("This meant " + person + " had 9 minutes left before he " + verb + ".");
    System.out.println();
    System.out.println("Panicking, the " + a1 + " grabbed a " + object1 + " and ran toward the " + vehicle + " parked outside.");
    System.out.println("Along the way, a " + adjective1 + " " + creature + " tried to stop him by yelling, \"" + funnyPhrase + "!\"");
    System.out.println("But there was no time to waste.");
    System.out.println();
    System.out.println("He sprinted past the " + placesPlural + ", through a crowd of " + pluralNoun + ", and into the " + adjective2 + " building.");
    System.out.println("Inside, he found a " + object2 + " glowing with a " + color1 + " light.");
    System.out.println("Picking it up, he realized it was the key to saving " + sillyNoun + ".");
    System.out.println();
    System.out.println("With only seconds left, the " + a1 + " shouted to " + person + ", \"We must " + verb + " before it’s too late!\"");
    System.out.println("The clock struck " + time + ", and suddenly everything turned " + color2 + ".");
    // --- End of story ---

    in.close(); // Close scanner to avoid memory leaks
  }

  /**
   * Subtracts a given number of minutes from a time string
   *  timeStr The original time as a string 
   *  minutesToSubtract Number of minutes to subtract
   *  The adjusted time as a string 
   */
  public static String subtractMinutes(String timeStr, int minutesToSubtract) { 
    try {
      String[] parts = timeStr.split(":"); // Split time into hours and minutes
      int hours = Integer.parseInt(parts[0]);
      int minutes = Integer.parseInt(parts[1]);
      
      // Subtract minutes
      minutes -= minutesToSubtract;
      
      // Adjust if minutes go below zero
      if (minutes < 0) {
        minutes += 60;
        hours -= 1;
      }
      
      // Adjust if hours go below zero wrap around 24-hour clock
      if (hours < 0) {
        hours += 24;
      }
      
      // Return formatted time string
      return String.format("%d:%02d", hours, minutes);
    } catch (Exception e) {
      // If input is invalid, return the original string
      return timeStr;
    }
  }
}
