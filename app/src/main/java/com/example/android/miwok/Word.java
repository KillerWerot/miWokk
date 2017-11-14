package com.example.android.miwok;

/**
 * Created by KillerWerot on 14/11/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    //private int    mImageResourceID=0;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    //public int getImageResourceID(){
      //  return mImageResourceID;
    //}
}