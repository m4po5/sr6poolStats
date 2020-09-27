import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoolCheckerTest {

    @Test
    void checkSuccesses() {
        D6[] dice = {new D6((byte) 2),new D6((byte) 5),new D6((byte) 6)};

        int result = PoolChecker.checkSuccesses(dice);

        assertEquals(2, result);
    }
}