package com.example.android.miwok;

/**
 * {@link Word} represents the vocabulary word the user wants to learn.
 * it contains a default translation and a miwok translation for that word.
 */

public class Word {

    /*default translation for the word*/
    private String mDefaultTranslation;

    /*Miwok translation for the word*/
    private String mMiwokTranslation;


    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*Get the default translation of our word*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*Get the Miwok translation of our word*/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

