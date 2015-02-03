package com.mejorandola.android.models;

import com.mejorandola.android.utils.DateUtils;

/**
 * Created by zeke on 2/2/15.
 */
public class Tweet {
    private String name;
    private String screenName;
    private String profileImageUrl;
    private String text;
    private String createdAt;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = "@" + screenName;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = DateUtils.setDateFormat(createdAt);
    }

    //private String name, screenName, profileImageUrl, text, createdAt;
}
