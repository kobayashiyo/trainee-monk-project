package no02.before;

//afterパッケージから参照できないようにpackage privateにしています
class SoundPool {
    private boolean mHasAppOpsPlayAudio;
    private AudioAttributes mAttributes = null;
    private int mMaxStreams;
    private int mStreamType;
    private int mSrcQuality;

    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_MUSIC = 2;


    /**
     * [問題]このコンスタラクタをbuilderパターンで置き換えてください。
     *
     * - stream_typeがmusicの時は、max_streams=1とする制限する<br>
     * - AudioAttributes はnullは許容しない<br>
     *
     * @param maxStreams
     * @param streamType
     * @param srcQuality
     * @param attributes
     * @param hasAppOpsPlayAudio
     */
    public SoundPool(int maxStreams, int streamType, int srcQuality, AudioAttributes attributes,  boolean hasAppOpsPlayAudio) {
    	if(streamType == STREAM_MUSIC && maxStreams != 1) {
    		throw new IllegalArgumentException("MaxStream must be 1 when using STREAM_MUSIC");
    	}
    	if (attributes == null) {
    		throw new IllegalArgumentException("Invalid null AudioAttributes");
    	}

    	this.mMaxStreams = maxStreams;
    	this.mStreamType = streamType;
    	this.mSrcQuality = srcQuality;
    	this.mAttributes = attributes;
    	this.mHasAppOpsPlayAudio = hasAppOpsPlayAudio;
 	}

    public SoundPool(int maxStreams, int streamType, int srcQuality, AudioAttributes attributes) {
    	this(maxStreams, streamType, srcQuality,attributes,false);
 	}

    // 以下は修正不要

	public boolean hasAppOpsPlayAudio() {
		return mHasAppOpsPlayAudio;
	}


	public AudioAttributes getAttributes() {
		return mAttributes;
	}


	public int getMaxStreams() {
		return mMaxStreams;
	}


	public int getStreamType() {
		return mStreamType;
	}


	public int getSrcQuality() {
		return mSrcQuality;
	}


	@Override
	public String toString() {
		return "Valid SoundPool!!!!";
	}

}
