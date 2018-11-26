# ターゲット
Effective Java 第3版 項目5  
資源を直接結びつけるよりも依存性注入を選ぶ

# お題
本にあるSpellCheckerを参考に作りました。  
（ライブラリからサンプルを持ってくるのは諦めました。。。）

# 用意したソースの解説
- SpellChecker
    - dictionaryを管理するお仕事
- JapaneseDictionaryTable
    - DBのレコードをごっそり持ってきてSetに詰める仕事をする
- SpellCheckerTest
    - SpellCheckerの動作を保証するためのTestクラス

# 問題
1. SpellCheckerが日本語の辞書を持っている
    - 異なる辞書に対応できない
        - 英語、中国語、ユーザが作成した辞書、...
2. SpellChekerが正しく動くかを確認するJUnitテストが簡単に書けない
    - テストしたいデータを入れたDBを用意する必要がある

# 解決策
- SpellChekerが任意のDictionaryを受け取れるようにする
    - JapaneseDictonaryTableの親クラスであるAbsDictionaryを作成する
    - **[依存性注入]** SpellCheckerのコンストラクタでAbsDictionaryを受け取れるようにする
- シングルトンが状態を持つのは適切ではないので、シングルトンをやめる（SpellChekerのはなし）
    - privateなコンストラクタを消す
    - 唯一のインスタンスを持っていた`INSTANCE`を消す

# 新たに発生した問題（各自解決策を考えてみてください）
- 同じDictionaryを持つSpellCheckerが複数作られてしまう問題
