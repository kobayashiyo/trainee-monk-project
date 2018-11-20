# お題
Java.io.InputStream/OutputStream

# ターゲット
## Effective Java 第3版 項目9
try-finallyよりもtry-with-resourcesを選ぶ

# 問題
1.問題01:finally句でExceptionが発生するとtry句のExceptionを隠蔽することがある
2.問題02:finally句でリソースを複数closeすると、一つ目でExceptionが発生すると後続のcloseが呼ばれない。それを考慮すると面倒な実装になる。


# 解決策（どれか）
- try-with-resources構文を使う
	- AutoClosable IF を実装する
	- リソースをnewするところでtry-with-resourcesを使う


# 実装するところ
- FileInputStreamとFileOutPutStreamの実装IFをMyClosableではなくAutoClosable IFに変更する
- BeforeMainNo09の各example01,example02メソッド内のtry-finallyをtry-with-resources構文に変更する
