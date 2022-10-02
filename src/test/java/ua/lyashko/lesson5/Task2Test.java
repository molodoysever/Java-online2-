package ua.lyashko.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {
    Integer[] resultFalse = new Integer[] { 1, 2, 3, 4, 5};
    Integer[] resultTrue = new Integer[] { 5, 4, 3, 2, 1};


    @Test
    void isDescendingReturnFalse () {
        Assertions.assertFalse ( Task2.isDescendingCheck ( resultFalse ) );
    }

    @Test
    void isDescendingReturnTrue () {
        Assertions.assertTrue ( Task2.isDescendingCheck ( resultTrue ) );
    }
}