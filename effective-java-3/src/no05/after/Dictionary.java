package no05.after;

import java.util.HashSet;
import java.util.Set;

public abstract class Dictionary {

    Dictionary() {
        prepareData();
    }

    protected Set<String> dictionarySet = new HashSet<>();

    protected abstract void prepareData();

    public boolean hasWord(String word) {
        return dictionarySet.contains(word);
    }

}
