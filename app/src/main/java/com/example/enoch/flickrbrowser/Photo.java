package com.example.enoch.flickrbrowser;

import java.io.Serializable;

/**
 * Created by Enoch on 2/7/2017.
 */

public class Photo implements Serializable {
    private static final long serialVersionID= 1L;

    private String mTitle;
    private String mAuthor;
    private String mAuthorID;
    private String mLink;
    private String mTags;
    private String mImage;


    public Photo(String mTitle, String mAuthor, String mAuthorID, String mLink, String mTags, String mImage) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mAuthorID = mAuthorID;
        this.mLink = mLink;
        this.mTags = mTags;
        this.mImage = mImage;
    }

    public static long getSerialVersionID() {
        return serialVersionID;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmAuthorID() {
        return mAuthorID;
    }

    public String getmLink() {
        return mLink;
    }

    public String getmTags() {
        return mTags;
    }

    public String getmImage() {
        return mImage;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mAuthorID='" + mAuthorID + '\'' +
                ", mLink='" + mLink + '\'' +
                ", mTags='" + mTags + '\'' +
                ", mImage='" + mImage + '\'' +
                '}';
    }
}
