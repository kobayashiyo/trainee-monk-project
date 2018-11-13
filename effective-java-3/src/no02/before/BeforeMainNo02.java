package no02.before;

/**
 * @author works
 *
 */
public class BeforeMainNo02 {
	public static void main(String[] args) {
		SoundPool soundPool = null;

		try {
			//catchされる条件でsoudPoolインスタンスを生成してください
			soundPool = new SoundPool(2, SoundPool.STREAM_MUSIC, 100, null);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここに来る
		}

		try {
			//catchされる条件でsoudPoolインスタンスを生成してください
			soundPool = new SoundPool(1, SoundPool.STREAM_MUSIC, 100, null);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここに来る
		}

		try {
			//catchされない条件でsoudPoolインスタンスを生成してください
			soundPool = new SoundPool(1, SoundPool.STREAM_MUSIC, 100, new AudioAttributes(), true);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここには来ない
		}

		System.out.println(soundPool);
		if (soundPool.hasAppOpsPlayAudio()) {
			System.out.println("hasAppOpsPlayAudio is True");
		}
	}
}
