# Mad Libs Word Substitution Generator

## Project Overview
This project is a **Mad Libs Generator** implemented in Java. The program collects user input for different word categories (such as nouns, verbs, adjectives, and more) and dynamically inserts them into a predefined story template. The result is a humorous, randomized narrative generated from user-provided words.

This assignment demonstrates core programming skills in:
- String manipulation
- User interaction via `Scanner`
- Basic function usage and modular programming
- Input handling and formatted output

---

## Features
- Accepts **15+ user inputs** for different categories of words (animals, objects, adjectives, colors, places, etc.).
- Performs **at least 5–7 substitutions** in the story template (this implementation uses significantly more).
- Includes a helper function `subtractMinutes` that adjusts a given time by subtracting a number of minutes.
- Story template contains multiple paragraphs with a beginning, middle, and end for added immersion.
- Error-handling in the `subtractMinutes` function ensures invalid inputs don’t crash the program.

---

## File Structure
├── MadLibs.java # Main program file containing logic and story
├── README.md # Documentation and explanation of project

yaml
Copy code

---

## How It Works

### 1. Input Collection
The program prompts the user for different categories of words (animals, objects, verbs, colors, etc.). Inputs are collected using the `Scanner` class.

**Example prompt:**
Enter an animal (protagonist): cat
Enter a place (singular): park
...

csharp
Copy code

### 2. Story Generation
The inputs are then inserted into the predefined story template. For example:
One day a cat walked into a park.
He then asked a dog what was the time.
The dog responded 11:25.

vbnet
Copy code

### 3. Helper Function
The program includes a helper function:

```java
public static String subtractMinutes(String timeStr, int minutesToSubtract) {
    // Adjusts the given time string (formatted as HH:mm)
    // by subtracting a specified number of minutes.
    // Demonstrates modular programming and time manipulation logic.
}
```

### Example Run
#### User Input

``` mathematica
Copy code
Enter an animal (protagonist): cat
Enter a place (singular): park
Enter another animal: dog
Enter a person's name: Alex
Enter a verb: run
```
#### Output Story

``` sql
Copy code
--- Your MadLibs Story ---
One day a cat walked into a park.
He then asked a dog what was the time.
The dog responded 11:25.
This meant Alex had 9 minutes left before he run.

Panicking, the cat grabbed a book and ran toward the bus parked outside.
Along the way, a silly dragon tried to stop him by yelling, "Banana pancakes!"
...
The clock struck 11:34, and suddenly everything turned purple.
```
### Functions Implemented
`main`: Handles user interaction, input collection, and story assembly.

`subtractMinute`s: Takes a time string in HH:mm format and subtracts minutes, ensuring proper wrap-around for hours.

### Development Milestones
## Planning

Defined the scope: at least 5–7 substitutions, modular functions, user prompts.

Designed a multi-paragraph story template to maximize substitutions.

#### Implementation

Built the main method with user input prompts.

Created the subtractMinutes helper function for added complexity.

#### Testing

Tested with valid times (e.g., 12:34) and invalid formats to ensure safe error handling.

Verified that all substitutions appear in the final output.

#### Finalization

Added inline comments for clarity.

Prepared documentation (README) and repo structure.

## How to Run
Compile the program:

```bash
javac MadLibs.java
```
Run the program:
```bash
java MadLibs
```
Follow the on-screen prompts to input your words.


### Future Enhancements
Add random template selection (multiple stories).

Allow user to replay without restarting the program.

Expand input validation for better error messages.
