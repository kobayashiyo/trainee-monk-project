package no05.after;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SpellCheckerTest {

    @Test
    public void checkWordWithNewDictionary() {
        SpellChecker checker = new SpellChecker(new TestDictionary());
        assertTrue(checker.checkWord("book"));
        assertTrue(checker.checkWord("AIスピーカー"));
        assertFalse(checker.checkWord("ほげー"));
        assertFalse(checker.checkWord("foobar"));
        assertFalse(checker.checkWord("信号"));
    }

    private class TestDictionary extends Dictionary {
        protected void prepareData() {
            dictionarySet.add("book");
            dictionarySet.add("AIスピーカー");
        }
    }

    @Test
    public void checkWordWithJpTableDictionary() {
        SpellChecker checker = new SpellChecker(new JapaneseDictionaryTable());
        assertTrue(checker.checkWord("信号"));
        assertFalse(checker.checkWord("ほげー"));
    }
}