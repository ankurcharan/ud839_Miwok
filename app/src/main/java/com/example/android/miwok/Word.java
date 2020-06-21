package com.example.android.miwok;

public class Word {

    private static final int NO_IMAGE_PROVIDED =  -1;

    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceId = imageResourceId;
    }

    public boolean hasImage() { return  imageResourceId != NO_IMAGE_PROVIDED; }

    public int getImageResourceId() { return imageResourceId; }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }
}
