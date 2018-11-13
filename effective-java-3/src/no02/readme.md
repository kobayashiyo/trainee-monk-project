# お題
android.media.SoundPool
※Android SDKのライブラリです。
[お題を解いたらみてね](http://tools.oesf.biz/android-9.0.0_r1.0/xref/frameworks/base/media/java/android/media/SoundPool.java)

# ターゲット
## Effective Java 第3版 項目2
多くのコンストラクタパラメータに直面したときは、ビルダーを検討する

# 問題
- 引数が多く(5つなのでそんなに多くないですがもっと多い想定..)、第n引数がxxxというのをぱっと見わからず可読性がわるい。


# 解決策（どれか）
1. Builderパターンを利用する。
※Builderパターンにも流儀があるそうです。
[参考 Javaで書くBuilderパターンのパターン](https://qiita.com/disc99/items/840cf9936687f97a482b)


# 実装するところ
- SoundPoolクラスをBuilderパターンで実装
- BeforeMainNo02.mainクラスをBuilderパターンを用いてインスタンス生成するように修正