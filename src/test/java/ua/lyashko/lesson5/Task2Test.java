package ua.lyashko.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {
    Integer[] result = new Integer[] { 1, 2, 3, 4, 5};

    @Test
    void isDescending () {
        Assertions.assertFalse ( Task2.isDescendingCheck ( result ) );
    }
}