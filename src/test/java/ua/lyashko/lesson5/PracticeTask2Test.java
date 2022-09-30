package ua.lyashko.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTask2Test {
    int[] sum = new int[] {1000, 2000, 3000};

    @Test
    void findAvgSum () {
        Assertions.assertEquals ( 5000, PracticeTask2.findAvgSum ( sum ) );
    }
}