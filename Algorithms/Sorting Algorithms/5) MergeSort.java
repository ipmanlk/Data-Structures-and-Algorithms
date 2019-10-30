/*
Merge Sort Algorithm
------------------------------------------------------------------------------
- Time Complexity: O(nlogn)-base 2.
- Not an in-place algorithm because temporary arrays are used.
- Stable algorithm.
- Devide and conquer algorithm.
- Recursive algorithm (But possible to implemeant using loops). 
- Two phases: Splitting and Merging.
- Splitting phase leads to faster sorting during the Merging phase.
- Splitting is logical. We don't create new arrays.

How this works
------------------------------------------------------------------------------
- It start with an unsorted array.
- Then devide it into two arrays called the left array and the right array. 
- Devide usually happens from the middle. 
- If array has odd number of elements you can choose to go with 
  upper bound or lower bound.
  
  ex,
  If array has 5 elements the middle is 5/2 = 2.5th element. So you can choose
  to devide from 2nd element or 3rd element. It doesn't really matter.

- Splitting happens until you get bunch of one element arrays. 
  Then merging phase begins.

- In merging phase you merge every left/right pair of sibling arrays into
  a sorted array.
- After the first merge we will get couple of two element sorted arrays.
- In the next merge we will get couple of four element sorted arrays.
- This goes on until we get a single sorted array.
*/

class MergeSort {
    public static void main(String[] args) {
        int[] intArray = { 30, 3, 40, 2, 55, -5 };

        mergetSort(intArray, 0, intArray.length);

        printArray(intArray);
    }

    public static void mergetSort(int[] inputArray, int startIndex, int endIndex) {
        if (endIndex - startIndex < 2) {
            return;
        }

        // partitioning index
        int midIndex = (startIndex + endIndex) / 2;

        // merge sort left partition
        mergetSort(inputArray, startIndex, midIndex);

        // merge sort right partition
        mergetSort(inputArray, midIndex, endIndex);

        // merge left and right partitions
        merge(inputArray, startIndex, midIndex, endIndex);
    }

    public static void merge(int inputArray[], int startIndex, int midIndex, int endIndex) {
        /*
         * check if the last element of left partition is less than or equal to the
         * first element in the right partition. This means both of them are sorted.
         * 
         * ex, Merge {7}, {55} (logical partition.)
         * 
         * We don't have to merge them because merge is gonna be equal to what we
         * already have. Which means result is gonna be equal to the input array.
         */
        if (inputArray[midIndex - 1] <= inputArray[midIndex]) {
            return;
        }

        // Otherwise, proceed with the merge.
        int i = startIndex;
        int j = midIndex;
        int tempIndex = 0;

        int[] tempArray = new int[endIndex - startIndex];

        while (i < midIndex && j < endIndex) {
            tempArray[tempIndex++] = inputArray[i] <= inputArray[j] ? inputArray[i++] : inputArray[j++];
        }

        System.arraycopy(inputArray, i, inputArray, startIndex + tempIndex, midIndex - i);
        System.arraycopy(tempArray, 0, inputArray, startIndex, tempIndex);
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}