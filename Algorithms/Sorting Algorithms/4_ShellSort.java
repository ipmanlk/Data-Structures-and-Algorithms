/*
Shell Sort Algorithm
------------------------------------------------------------------------------
- Time Complexity: Difficult to tell. Worst case: Quadratic O(n^2).
- Variation of Insertion Sort.
- In-place algorithm.
- Doesn't require as much shifting as insertion sort.
- Performs better than insertion sort.
- Unstable algorithm.
- Has a larger gap value.
- As the algorithm progresses, the gap value is reduced.
- Gap value of 1 is equal to the Insertion Sort.
- Final iteration is actually an Insertion Sort.

Gap/Interval Value (https://en.wikipedia.org/wiki/Shellsort)
------------------------------------------------------------------------------
- There are many ways to calculate the gap value.
- Method used to calculate the gap value can influence the time complexity.
- One common way is Knuth Sequence.

Knuth Sequence
------------------------------------------------------------------------------
- Gap Value = ((3^k) - 1) / 2
- k is set based on the length of the array.
- Gap value needs be be close as possible to the length of the array we want
  to sort, without being greater than the length.

Notes
------------------------------------------------------------------------------
- In this implementation gap value is calcualted using,
  GapValue = array.length / 2

- Then in each iteration we use,
  GapValue = (GapValue / 2) to calculate the next gap value.

- This goes on until the gap value is equal to 1.
*/

class ShellSort {
    public static void main(String[] args) {
        int intArray[] = { 20, 35, -15, 7, 55, 1, -22 };

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        printArray(intArray);
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}