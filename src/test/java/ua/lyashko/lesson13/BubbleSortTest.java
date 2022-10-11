package ua.lyashko.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest extends BubbleSort {
    int[] unsortedArr = {3 , 8 , 2};
    int[] sortedArr = {2 , 3 , 8};

    @Test
    void shouldBubbleSortArray () {
        Assertions.assertArrayEquals ( sortedArr , bubbleSort ( unsortedArr ) );
    }
}