package no01.before;

public class Boolean {

	public boolean value;

	public Boolean(boolean value) {
		this.value = value;
	}

	public boolean booleanValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return value ? "true" : "false";

	}

	/*TODO
	
	*  課題1：あらゆるクラスでオブジェクトが大量に作られてしまう。
	*
	*     Boolean　 b  = new Boolean(true);
	*
	*
	*  無駄なので、trueを変数の値に持つBooleanと、falseを変数の値に持つBooleanの2つのみを生成して、
	*  使いまわしすることでメモリの利用を効率化したい。
	*
	*
	*  課題2：オブジェクトをDBに保存ができない
	*
	*  Booleanクラスをメンバ変数に持つオブジェクトをバイナリにして、
	*  そのままDBに保存したい。が今のままではできない。
	*
	*  Obj obj = new Obj(val1,val2,b);*
	*  dao.store(obj);
	*  Obj obj = dao.load();
	*
	*  などができない。
	*
	*
	*　その他の改善点
	*　継承できてしまうけど、いる？
	*　メンバ変数が書き換えられるけど、それいる？
	*
	**
	*/

}
