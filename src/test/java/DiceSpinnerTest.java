import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceSpinnerTest {

    @Test
    void hasNextShouldBeTrueTest() {
        DiceSpinner spinner = new DiceSpinner(2);

        spinner.spinUp();

        assertEquals(true, spinner.hasNext());
    }

    @Test
    void hasNextShouldBeFalseTest() {
        DiceSpinner spinner = new DiceSpinner(2);

        for (int i = 0; i < 35; i++) {
            spinner.spinUp();
        }

        assertEquals(false, spinner.hasNext());
    }

    @Test
    void spinUp() {
        DiceSpinner spinner = new DiceSpinner(2);

        spinner.spinUp();

        assertEquals("2 1 ", spinner.poolToString());
    }

    @Test
    void spinUpMultipleDiceTest(){
        DiceSpinner spinner = new DiceSpinner(2);

        for (int i = 0; i < 6; i++) {
            spinner.spinUp();
        }

        assertEquals("1 2 ", spinner.poolToString());
    }
}