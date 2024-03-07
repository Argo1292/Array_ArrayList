import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Getting user input for the array using the UserInput class
        int[] userArray = UserInput.getUserArray();

        // Converting the array into an ArrayList
        ArrayList<Integer> arrayList = ArrayConverter.arrayToArrayList(userArray);

        // Displaying the contents of the ArrayList
        ArrayConverter.displayArrayList(arrayList);

        // Converting the ArrayList back into an array
        int[] newArray = ArrayConverter.arrayListToArray(arrayList);

        // Displaying the contents of the new array
        ArrayConverter.displayArray(newArray);
    }
}
