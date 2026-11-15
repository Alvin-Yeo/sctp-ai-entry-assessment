// Question 3 - String Manipulation
// Topic: Name Formatting Utility
//
// Task 1:
// Write a method called formatName(firstName, lastName) that accepts two Strings
// and returns a formatted String in this format: "lastName, firstName"
// Example: formatName("John", "Smith") → "Smith, John"
//
// Task 2:
// Write a method called formatInitials(firstName, lastName) that returns the
// initials of the person as a String in uppercase.
// Example: formatInitials("john", "smith") → "J.S."
// Note: your method should handle inputs in any case (upper, lower, or mixed)
// and always produce properly capitalised output.

public class Q3_java {

    public static String formatName(String firstName, String lastName) {
        // Add your code here
        String capitalizedFirstName = capitalizeName(firstName);
        String capitalizedLastName = capitalizeName(lastName);
        return "\"%s, %s\"".formatted(capitalizedLastName, capitalizedFirstName);
    }

    public static String formatInitials(String firstName, String lastName) {
        // Add your code here
        char firstInitial = capitalizeName(firstName).charAt(0);
        char lastInitial = capitalizeName(lastName).charAt(0);
        return "\"%c.%c.\"".formatted(firstInitial, lastInitial);
    }

    private static String capitalizeName(String name) {
        if(name == null || name.isBlank()) {
            return " ";
        }

        String trimmedName = name.trim();
        return trimmedName.substring(0, 1).toUpperCase() + trimmedName.substring(1);
    }

    public static void main(String[] args) {
        // Task 3: Call both methods with the following inputs and print each result:
        //   formatName("Alice", "Tan")    → Expected: "Tan, Alice"
        //   formatName("bob", "lim")      → Expected: "Lim, Bob"
        //   formatInitials("Alice","Tan") → Expected: "A.T."
        //   formatInitials("bob","lim")   → Expected: "B.L."

        // Add your code here
        System.out.println(formatName("Alice", "Tan"));
        System.out.println(formatName("bob", "lim"));
        System.out.println(formatInitials("Alice","Tan"));
        System.out.println(formatInitials("bob","lim"));
    }
}
