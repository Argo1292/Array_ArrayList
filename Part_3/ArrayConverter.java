import java.util.*;
public class ArrayConverter {
    // Method to convert an array into an ArrayList
    public static ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int element : array) {
            arrayList.add(element);
        }

        return arrayList;
    }

    // Method to convert an ArrayList into an array
    public static int[] arrayListToArray(ArrayList<Integer> arrayList) {
        int[] array = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        return array;
    }

    // Method to display the contents of an ArrayList
    public static void displayArrayList(ArrayList<Integer> arrayList) {
        System.out.println("ArrayList elements: " + arrayList);
    }

    // Method to display the contents of an array
    public static void displayArray(int[] array) {
        System.out.println("Array elements: " + Arrays.toString(array));
    }
}
