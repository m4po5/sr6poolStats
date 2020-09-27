import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class D6Test {
    @Test
    public void SetValueTest(){
        D6 die = new D6();
        byte x = 2;

        try {
            die.setValue(x);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertEquals(x, die.getValue());
    }

    @Test
    public void SetValueWrongText(){
        D6 die = new D6();
        byte x = 7;

        Exception exception = assertThrows(Exception.class, () -> die.setValue(x) );

        assertEquals("value beyond limits", exception.getMessage());
    }
}