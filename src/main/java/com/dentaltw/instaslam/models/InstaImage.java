package com.dentaltw.instaslam.models;

import android.net.Uri;

/**
 * Created by Scott on 2017/4/27.
 */

public class InstaImage {
    private Uri url;

    public Uri getUrl() {
        return url;
    }

    public InstaImage(Uri url) {
        this.url = url;
    }
}
