/*
Insertion Sort Algorithm
---------------------------------------------------------------
- Time Complexity: Quadratic O(n^2).
- In-place algorithm.
- Stable algorithm.
- If array is already sorted, time complexity is linear O(n).
- Has a gap value of 1.
- Compares value to its neighbors.
*/

class InsertionSort {
    public static void main(String[] args) {
        int intArray[] = { 20, 30, 5, 3, 6, 7, 5, 4 };

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];
            int i;

            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }

        printArray(intArray);
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}