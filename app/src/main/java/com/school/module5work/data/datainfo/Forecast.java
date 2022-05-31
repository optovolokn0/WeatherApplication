package com.school.module5work.data.datainfo;

import com.google.gson.JsonArray;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Forecast {

    public Long getDateTs() {
        return dateTs;
    }

    public Forecast setDateTs(Long dateTs) {
        this.dateTs = dateTs;
        return this;
    }

    public Long getWeek() {
        return week;
    }

    public Forecast setWeek(Long week) {
        this.week = week;
        return this;
    }

    public String getSunrise() {
        return sunrise;
    }

    public Forecast setSunrise(String sunrise) {
        this.sunrise = sunrise;
        return this;
    }

    public String getSunset() {
        return sunset;
    }

    public Forecast setSunset(String sunset) {
        this.sunset = sunset;
        return this;
    }

    public Long getMoonCode() {
        return moonCode;
    }

    public Forecast setMoonCode(Long moonCode) {
        this.moonCode = moonCode;
        return this;
    }

    public String getMoonText() {
        return moonText;
    }

    public Forecast setMoonText(String moonText) {
        this.moonText = moonText;
        return this;
    }

    public JsonArray getParts() {
        return parts;
    }

    public Forecast setParts(JsonArray parts) {
        this.parts = parts;
        return this;
    }

    public String getDate() {
        return date;
    }

    public Forecast setDate(String date) {
        this.date = date;
        return this;
    }

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("date_ts")
    @Expose
    private Long dateTs;
    @SerializedName("week")
    @Expose
    private Long week;
    @SerializedName("sunrise")
    @Expose
    private String sunrise;
    @SerializedName("sunset")
    @Expose
    private String sunset;
    @SerializedName("moon_code")
    @Expose
    private Long moonCode;
    @SerializedName("moon_text")
    @Expose
    private String moonText;
    @SerializedName("parts")
    @Expose
    private JsonArray parts;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Восход в ").append(sunrise);
        sb.append(", заход в ").append(sunset);
//        sb.append("\nparts=").append(parts);
        return sb.toString();
    }
}
