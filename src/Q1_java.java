// Question 1 - Functions and Conditionals
// Topic: Temperature Converter
//
// Task 1:
// Write a method called convertTemp that accepts two arguments:
//   - value: a numeric temperature value (double)
//   - unit: a String, either "C" for Celsius or "F" for Fahrenheit
//
// The method should:
//   - Convert Celsius to Fahrenheit if unit is "C"  →  Formula: (value × 9/5) + 32
//   - Convert Fahrenheit to Celsius if unit is "F"  →  Formula: (value − 32) × 5/9
//   - Return -1 if unit is neither "C" nor "F"
//   - Round the result to 2 decimal places before returning

public class Q1_java {

    public static double convertTemp(double value, String unit) {
        // Add your code here
        if(unit != "C" && unit != "F"){
            return -1;
        }

        double result = 0;

        if(unit == "C") {
            result = (value * 9 / 5) + 32;
        }

        if(unit == "F") {
            result = (value - 32) * 5 / 9;
        }

        return Math.round(result * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        // Task 2:
        // Call the method with the following inputs and print each result:
        //   convertTemp(100, "C")  → Expected: 212.0
        //   convertTemp(32, "F")   → Expected: 0.0
        //   convertTemp(37, "C")   → Expected: 98.6
        //   convertTemp(0, "X")    → Expected: -1.0

        // Add your code here
        System.out.println(convertTemp(100, "C"));
        System.out.println(convertTemp(32, "F"));
        System.out.println(convertTemp(37, "C"));
        System.out.println(convertTemp(0, "X"));
    }
}
