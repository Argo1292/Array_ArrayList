import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        // Create an instance of the UserInput class to get input from the user
        UserInput inp = new UserInput();
        // Get the size of the array from the user
        int size = inp.size();
        // Get an array of doubles from the user
        double[] inputArray = inp.array(size);
        // Initialize the distance with the absolute difference between the first two elements
        double distance = Math.abs(inputArray[0] - inputArray[1]);
        // Initialize indices of neighboring elements with the first two indices
        int neighbourIndex1 = 0;
        int neighbourIndex2 = 1;
        // Iterate through the array to find the smallest distance between neighboring elements
        for (int i = 0; i < size - 1; i++) {
            // Calculate the absolute difference between the current element and the next element
            double currentDistance = Math.abs(inputArray[i]
                    - inputArray[i + 1]);
            // Check if the current distance is smaller than the current smallest distance
            if (currentDistance < distance) {
                // Update indices and distance if the current distance is smaller
                neighbourIndex1 = i;
                neighbourIndex2 = i + 1;
                distance = currentDistance;
            }
        }
        // Display the result with a meaningful message
        System.out.println("The Smallest Distance in the Ar ray is: " + distance + " between " + inputArray[neighbourIndex1] + " and " + inputArray[neighbourIndex2]);
    }
}