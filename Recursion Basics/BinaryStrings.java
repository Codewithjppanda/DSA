public class BinaryStrings {

    // Recursive function to generate binary strings
    static void generateBinaryStrings(String currentString, int n) {
        // Base case: If the string length reaches n, print it
        if (currentString.length() == n) {
            System.out.println(currentString);
            return;
        }

        // Recursive case: Append '0' and '1' to the current string and recurse
        generateBinaryStrings(currentString + "0", n);
        generateBinaryStrings(currentString + "1", n);
    }

    public static void main(String[] args) {
        int n = 3; // Length of binary strings to generate
        generateBinaryStrings("", n);
    }
}
// //The generateBinaryStrings function takes two arguments:

// currentString: The binary string generated so far.
// n: The desired length of the binary strings.
// Base Case: If the length of currentString equals n, print the string.

// Recursive Case:

// Append 0 to the currentString and call the function recursively.
// Append 1 to the currentString and call the function recursively.
// Start with an empty string "" and recursively build binary strings until the length reaches n.

// Example Output
// For n = 3, the program will generate the following binary strings:

// Copy code
// 000
// 001
// 010
// 011
// 100
// 101
// 110
// 111
// Complexity
// Time Complexity: 
// 𝑂
// (
// 2
// 𝑛
// )
// O(2 
// n
//  ), as each binary string has two choices (0 or 1) for each position.
// Space Complexity: 
// 𝑂
// (
// 𝑛
// )
// O(n), for the recursion stack in the worst case.