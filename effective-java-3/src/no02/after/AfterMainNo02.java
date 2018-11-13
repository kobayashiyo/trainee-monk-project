package no02.after;


/**
 * @author works
 *
 */
public class AfterMainNo02 {
	public static void main(String[] args) {
		SoundPool soundPool = null;

		try {
			//catchされる条件でsoudPoolインスタンスを生成してください
			//			soundPool = new SoundPool(2, SoundPool.STREAM_MUSIC, 100, null);
			soundPool = new SoundPool.Builder().maxStream(2).streamType(SoundPool.STREAM_MUSIC)
					.srcQuality(100).build();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここに来る
		}

		try {
			//catchされる条件でsoudPoolインスタンスを生成してください
//			soundPool = new SoundPool(1, SoundPool.STREAM_MUSIC, 100, null)
			soundPool = new SoundPool.Builder().maxStream(1).streamType(SoundPool.STREAM_MUSIC)
					.srcQuality(100).build();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここに来る
		}

		try {
			//catchされない条件でsoudPoolインスタンスを生成してください
//			soundPool = new SoundPool(1, SoundPool.STREAM_MUSIC, 100, new AudioAttributes(), true);
			soundPool = new SoundPool.Builder().maxStream(1).streamType(SoundPool.STREAM_MUSIC)
					.srcQuality(100).audioAttributes(new AudioAttributes()).hasAppOpsPlayAudio(true).build();
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage()); //ここには来ない
		}

		System.out.println(soundPool);
		if (soundPool.hasAppOpsPlayAudio()) {
			System.out.println("hasAppOpsPlayAudio is True");
		}
	}
}
