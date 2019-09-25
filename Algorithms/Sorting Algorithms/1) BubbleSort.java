/*
Bubble Sort Algorithm
--------------------------------------------------
- Time Complexity: Quadratic O(n^2).
- In-place algorithm.
- Algorithm degrades quickly.
*/

class BubbleSort {
    public static void main(String[] args) {
        int intArray[] = { 20, 30, 5, 3, 6, 7, 5, 4 };

        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
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