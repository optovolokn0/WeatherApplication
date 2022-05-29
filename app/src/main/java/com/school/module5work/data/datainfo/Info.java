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
        final StringBuilder sb = new StringBuilder("Info{");
        sb.append("\n\t\tlat=").append(lat);
        sb.append(", \n\t\tlon=").append(lon);
        sb.append('}');
        return sb.toString();
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
