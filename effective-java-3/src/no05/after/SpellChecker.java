package no05.after;

public class SpellChecker {

//    // 唯一のインスタンスへのアクセス
//    public static final SpellChecker INSTANCE = new SpellChecker();

    // 下層の資源を持っている
    private Dictionary dictionary;

    SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }

//    // シングルトンのためコンストラクタは隠蔽
//    private SpellChecker() { }

    // 辞書に単語があるかを返す
    public boolean checkWord(String word) {
        return dictionary.hasWord(word);
    }
}
