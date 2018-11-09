package no1.after;
import java.io.Serializable;

//バイナリにできるようにSerializableマーカーを実装
//継承される必要がないので、finalを追加
public final class Boolean implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	//変更不要なので、final　を追加
	public final boolean value;

	public static final Boolean TRUE = new Boolean(true);
	public static final Boolean FALSE = new Boolean(false);

	//new されないようにprivate化
	private Boolean(boolean value) {
		this.value = value;
	}

	public boolean booleanValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return value ? "true" : "false";

	}

}
