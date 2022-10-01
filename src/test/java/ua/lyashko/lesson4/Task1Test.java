package ua.lyashko.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Task1Test {
    int[] arrArr = new int[] {2, 3, 10 };
    int[] arrGeom = new int[] {1, 1, 2, 2, 3 };

    @Test
    void avaregeArr () {
        Assertions.assertEquals ( 5, Task1.avaregeArr ( arrArr ) );
    }

    @Test
    void averageGeom () {
            Assertions.assertEquals ( 1.5157165665103982, Task1.averageGeom ( arrGeom ) );
    }
}