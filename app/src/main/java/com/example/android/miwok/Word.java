package com.example.android.miwok;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jd158 on 21/08/2016.
 */
public class    Word {



    // Default Translation of the word
    private String mDefaultTraslation;

    // Default Translation of the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    // Default Translation of the word
    private String mMiwokTranslation;

    /** Audio resource ID for the word */

    // Default Audio of the word

    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String DefaultTraslate, String MiwokTranslate, int ImageResourceId, int AudioResourceId){
        mDefaultTraslation = DefaultTraslate;
        mMiwokTranslation = MiwokTranslate;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = AudioResourceId;



    }

    public Word(String DefaultTraslate, String MiwokTranslate, int AudioResourceId){
        mDefaultTraslation = DefaultTraslate;
        mMiwokTranslation = MiwokTranslate;
        mAudioResourceId = AudioResourceId;
    }

    // Get default translation of the word

    public String getDefaultTraslation () {
        return mDefaultTraslation;
    }

    // Get Miwok traslation word

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    // Get Image of the word

    public int getImageResourceId () {
        return mImageResourceId;
    }

    // Check whether or not there is image for this word
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // Get the Audio of Word

    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTraslation='" + mDefaultTraslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
