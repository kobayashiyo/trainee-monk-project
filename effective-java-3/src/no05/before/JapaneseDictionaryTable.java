package no05.before;

import java.util.HashSet;
import java.util.Set;

public class JapaneseDictionaryTable {
    private Set<String> dictionarySet;

    JapaneseDictionaryTable() {
        loadFromDB();
    }

    private void loadFromDB() {
        dictionarySet = new HashSet<String>();

        // ここでDBから取得して、dictionarySetに詰める
        // 「信号」がDBにあったとする
        dictionarySet.add("信号");
    }

    boolean hasWord(String word) {
        return dictionarySet.contains(word);
    }

}
