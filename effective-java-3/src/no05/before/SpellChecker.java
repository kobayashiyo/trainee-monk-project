package no05.before;

public class SpellChecker {

    // 唯一のインスタンスへのアクセス
    public static final SpellChecker INSTANCE = new SpellChecker();

    // 下層の資源を持っている
    private JapaneseDictionaryTable jpDict = new JapaneseDictionaryTable();

    // シングルトンのためコンストラクタは隠蔽
    private SpellChecker() { }

    // 辞書に単語があるかを返す
    public boolean checkWord(String word) {
        return jpDict.hasWord(word);
    }
}
