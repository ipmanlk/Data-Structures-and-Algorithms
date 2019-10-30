/*
Selection Sort Algorithm
--------------------------------------------------
- Time Complexity: Quadratic O(n^2).
- In-place algorithm.
- Doesn't require as much swapping as bubble sort.
- Unstable algorithm.
*/

class SelectionSort {
    public static void main(String[] args) {
        int intArray[] = { 20, 30, 5, 3, 6, 7, 5, 4 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }

            swap(intArray, largest, lastUnsortedIndex);
        }

        printArray(intArray);
    }

    static void swap(int array[], int i, int j) {
        if (i == j)
            return;
        if (array[i] > array[j]) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    static void printArray(int array[]) {
        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}