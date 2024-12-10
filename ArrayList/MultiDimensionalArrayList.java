import java.util.ArrayList;

public class MultiDimensionalArrayList{
    public static void main(String[] args) {
        // Creating a multi-dimensional ArrayList
        ArrayList<ArrayList<Integer>> multiDimList = new ArrayList<>();

        // Adding rows (ArrayLists) to the multi-dimensional ArrayList
        for (int i = 0; i < 3; i++) { // Create 3 rows
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) { // Add 3 columns to each row
                row.add(i * j); // Example: Filling with product of indices
            }
            multiDimList.add(row); // Add the row to the multi-dimensional ArrayList
        }

        // Display the multi-dimensional ArrayList
        System.out.println("Multi-dimensional ArrayList:");
        for (ArrayList<Integer> row : multiDimList) {
            System.out.println(row);
        }

        // Accessing specific elements
        int element = multiDimList.get(1).get(2); // Element at row 1, column 2
        System.out.println("Element at row 1, column 2: " + element);

        // Modifying an element
        multiDimList.get(1).set(2, 99); // Set the value at row 1, column 2 to 99
        System.out.println("After modification:");
        for (ArrayList<Integer> row : multiDimList) {
            System.out.println(row);
        }
    }
}
