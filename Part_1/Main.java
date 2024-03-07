/*
 Rampalli Agni Mithra
 22070126083
 AIML B1
*/

public class Main {
    // Method to separate even and odd numbers into different arrays
    public static void processNumbers(int[] numbers) {
        // Arrays to store even and odd numbers
        int[] even;
        int[] odd;

        // Counting the number of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Initializing even and odd arrays with respective sizes
        even = new int[evenCount];
        odd = new int[oddCount];

        // Populating even and odd arrays
        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                even[evenIndex++] = num;
            } else {
                odd[oddIndex++] = num;
            }
        }

        // Printing the even and odd arrays
        System.out.println("\nEven numbers:");
        for (int num : even) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : odd) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        // Getting user input using the UserInput class
        int[] userNumbers = UserInput.getUserNumbers();

        // Processing and displaying even and odd numbers
        processNumbers(userNumbers);
    }
}
