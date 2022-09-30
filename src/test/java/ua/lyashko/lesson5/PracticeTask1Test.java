package ua.lyashko.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PracticeTask1Test {
    int[] heights = {120, -125, 130, -145};


    @Test
    void calcBoysAvgHeight () {
        Assertions.assertEquals ( 135, PracticeTask1.calcBoysAvgHeight ( heights ));
    }

    @Test
    void calcGirlsAvgHeight () {
        Assertions.assertEquals ( 125, PracticeTask1.calcGirlsAvgHeight ( heights ) );
    }
}