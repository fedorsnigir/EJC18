package enu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testRecognizeDog() {
        assertTrue(Main.recognizeDog("Snezhok"));
        assertTrue(Main.recognizeDog("cherNish"));
        assertTrue(Main.recognizeDog("rizhik"));
        assertFalse(Main.recognizeDog("sharik"));
        assertFalse(Main.recognizeDog("barsik"));
    }

}