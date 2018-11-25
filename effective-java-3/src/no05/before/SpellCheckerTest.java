package no05.before;

import org.junit.Test;

import static org.junit.Assert.*;

public class SpellCheckerTest {

    @Test
    public void checkWord() {
        SpellChecker checker = SpellChecker.INSTANCE;
        assertTrue(checker.checkWord("信号"));
        assertFalse(checker.checkWord("ほげー"));
    }
}