import java.io.*;
import java.util.*;
public class UserInput {
    // Method to get the size of the array from the user
    int size() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size of the Array: ");
        return scan.nextInt();
    }
    // Method to get an array of doubles from the user
    double[] array(int size) throws IOException {
        // Create an array to store user input
        double[] inputArray = new double[size];
        // Create a BufferedReader to read input from the user
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Prompt the user to enter elements
        System.out.println("Enter " + size + " Elements: ");
        // Read the entire line of input
        String array = br.readLine();
        // Split the input line into individual elements using whitespace as a delimiter
        String[] input = array.trim().split("\\s+");
        // Convert each element to a double and store it inthe array
        for(int i = 0; i < size; i++) {
            inputArray[i] = Double.parseDouble(input[i]);
        }
        // Return the array of doubles
        return inputArray;
    }
}