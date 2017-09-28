package com.example.android.miwok;

import android.support.annotation.Nullable;

/**
 * Created by SUMITABHA on 22-05-2017.
 */
public class Word {

    private String mDefaultTranslation;
    private String mSpanishTranslation;
    private String mFrenchTranslation;
    private int mImageResourceId;


    public Word(String defaultTranslation, String spanishTranslation, String frenchTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;

    }

    public Word(String defaultTranslation, String spanishTranslation, String frenchTranslation) {
        mDefaultTranslation = defaultTranslation;
        mSpanishTranslation = spanishTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = -1;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getSpanishTranslation() {
        return mSpanishTranslation;
    }
    public String getFrenchTranslation()
    {
        return mFrenchTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

}
