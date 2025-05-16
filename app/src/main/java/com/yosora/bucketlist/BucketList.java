package com.yosora.bucketlist;

import androidx.annotation.DrawableRes;

public class BucketList {

    String title;
    String description;
    int image;

    public BucketList(String title, String description, @DrawableRes int image) {
        this.title = title;
        this.description = description;
        this.image = image;
    }
}
