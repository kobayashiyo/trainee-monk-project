package no05.after;

public class JapaneseDictionaryTable extends Dictionary {

    protected void prepareData() {
        // ここでDBから取得して、dictionarySetに詰める
        // 「信号」がDBにあったとする
        dictionarySet.add("信号");
    }

}
