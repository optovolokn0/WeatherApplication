package com.school.module5work.data.datainfo;

import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("lat")
    private Double lat;
    @SerializedName("lon")
    private Double lon;
    @SerializedName("url")
    private String url;

    @Override
    public String toString() {
        String sb = "Город: Екатеринбург";
        return sb;
    }

    public Double getLat() {
        return lat;
    }

    public Info setLat(Double lat) {
        this.lat = lat;
        return this;
    }

    public Double getLon() {
        return lon;
    }

    public Info setLon(Double lon) {
        this.lon = lon;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Info setUrl(String url) {
        this.url = url;
        return this;
    }
}
