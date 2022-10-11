package ua.lyashko.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BinarySearchTest extends BinarySearch {
   private final int[] arr = {5, 2, 8};

    @Test
    void shouldBinarySearchFoundElement () {
        Assertions.assertEquals ( 1, binarySearch ( arr,2 ) );
    }

    @Test
    void shouldBinarySearchNoSuchElement () {
        Assertions.assertEquals ( -1, binarySearch ( arr, 12 ) );
    }
}