import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsCollectorTest {

    @Test
    void mainTest() {
        int[] stats = StatsCollector.main(2);

        assertEquals(4, stats[2]);
        assertEquals(16, stats[1]);
        assertEquals(16, stats[0]);
    }
}