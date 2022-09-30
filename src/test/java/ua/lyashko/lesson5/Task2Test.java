package ua.lyashko.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {
    Integer[] result = new Integer[] { 1, 2, 3, 4, 5};

    @Test
    void isDescending () {
        Integer[] expected = new Integer[] {5, 4, 3, 2, 1};
        Assertions.assertArrayEquals ( expected, Task2.descendingSort ( result ) );
    }
}