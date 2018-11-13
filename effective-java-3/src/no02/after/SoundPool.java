package no02.after;


class SoundPool {
    private boolean mHasAppOpsPlayAudio;
    private AudioAttributes mAttributes = null;
    private int mMaxStreams;
    private int mStreamType;
    private int mSrcQuality;

    public static final int STREAM_SYSTEM = 1;
    public static final int STREAM_MUSIC = 2;


    // Builderインナークラスでインスタンス生成するのでprivate
    private SoundPool(Builder builder) {
    	this.mHasAppOpsPlayAudio = builder.mHasAppOpsPlayAudio;
    	this.mAttributes = builder.mAttributes;
    	this.mMaxStreams = builder.mMaxStreams;
    	this.mStreamType = builder.mStreamType;
    	this.mSrcQuality = builder.mSrcQuality;
    }

    public static class Builder {
        private boolean mHasAppOpsPlayAudio = false;
        private AudioAttributes mAttributes = null;
        private int mMaxStreams;
        private int mStreamType;
        private int mSrcQuality;

        public Builder() {
        }

        public Builder hasAppOpsPlayAudio(boolean hasAppOpsPlayAudio) {
        	this.mHasAppOpsPlayAudio = hasAppOpsPlayAudio;
        	return this;
        }

        public Builder audioAttributes(AudioAttributes attributes) {
        	this.mAttributes = attributes;
        	return this;
        }

        public Builder maxStream(int maxStream) {
        	this.mMaxStreams = maxStream;
        	return this;
        }

        public Builder streamType(int streamType) {
        	this.mStreamType = streamType;
        	return this;
        }

        public Builder srcQuality(int srcQuality) {
        	this.mSrcQuality = srcQuality;
        	return this;
        }

        public SoundPool build() {
        	if(mStreamType == STREAM_MUSIC && mMaxStreams != 1) {
        		throw new IllegalArgumentException("MaxStream must be 1 when using STREAM_MUSIC");
        	}
        	if (mAttributes == null) {
        		throw new IllegalArgumentException("Invalid null AudioAttributes");
        	}

        	return new SoundPool(this);
        }


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
