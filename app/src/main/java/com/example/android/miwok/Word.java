package com.example.android.miwok;

/**
 * Created by KillerWerot on 14/11/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResource;



    public Word(String defaultTranslation, String miwokTranslation, int audioResource ){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResource = audioResource;
    }

    public Word(String defaultTranslation, String miwokTranslation, int ImageResourceID, int audioResource){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = ImageResourceID;
        mAudioResource = audioResource;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceID(){
      return mImageResourceID;
    }

    public boolean hasImage(){return mImageResourceID != NO_IMAGE_PROVIDED;}

    public int getAudioResource() {
        return mAudioResource;
    }
}
