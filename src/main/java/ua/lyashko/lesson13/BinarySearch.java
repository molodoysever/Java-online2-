package ua.lyashko.lesson13;

public class BinarySearch {
    public int binarySearch (int[] arr, int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while ( firstIndex <= lastIndex ) {
            int midIndex = (firstIndex + lastIndex) / 2;
            if (arr[midIndex] == elementToSearch) {
                return midIndex;
            } else if (arr[midIndex] < elementToSearch) {
                firstIndex = midIndex + 1;
            } else if (arr[midIndex] > elementToSearch) {
                lastIndex = midIndex - 1;
            }
        }
        return -1;
    }
}
