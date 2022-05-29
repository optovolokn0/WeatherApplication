package com.school.module5work.data.datainfo;

import com.google.gson.annotations.SerializedName;

public class Fact {
    @SerializedName("temp")
    private Long temp;
    @SerializedName("feels_like")
    private Long feelsLike;
    @SerializedName("icon")
    private String icon;
    @SerializedName("condition")
    private String condition;
    @SerializedName("wind_speed")
    private Double windSpeed;
    @SerializedName("wind_gust")
    private Double windGust;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mm")
    private Long pressureMm;
    @SerializedName("pressure_pa")
    private Long pressurePa;
    @SerializedName("humidity")
    private Long humidity;
    @SerializedName("daytime")
    private String daytime;
    @SerializedName("polar")
    private Boolean polar;
    @SerializedName("season")
    private String season;

    public Long getTemp() {
        return temp;
    }

    public Fact setTemp(Long temp) {
        this.temp = temp;
        return this;
    }

    public Long getFeelsLike() {
        return feelsLike;
    }

    public Fact setFeelsLike(Long feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    public String getIcon() {
        return icon;
    }

    public Fact setIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public String getCondition() {
        return condition;
    }

    public Fact setCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public Fact setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
        return this;
    }

    public Double getWindGust() {
        return windGust;
    }

    public Fact setWindGust(Double windGust) {
        this.windGust = windGust;
        return this;
    }

    public String getWindDir() {
        return windDir;
    }

    public Fact setWindDir(String windDir) {
        this.windDir = windDir;
        return this;
    }

    public Long getPressureMm() {
        return pressureMm;
    }

    public Fact setPressureMm(Long pressureMm) {
        this.pressureMm = pressureMm;
        return this;
    }

    public Long getPressurePa() {
        return pressurePa;
    }

    public Fact setPressurePa(Long pressurePa) {
        this.pressurePa = pressurePa;
        return this;
    }

    public Long getHumidity() {
        return humidity;
    }

    public Fact setHumidity(Long humidity) {
        this.humidity = humidity;
        return this;
    }

    public String getDaytime() {
        return daytime;
    }

    public Fact setDaytime(String daytime) {
        this.daytime = daytime;
        return this;
    }

    public Boolean getPolar() {
        return polar;
    }

    public Fact setPolar(Boolean polar) {
        this.polar = polar;
        return this;
    }

    public String getSeason() {
        return season;
    }

    public Fact setSeason(String season) {
        this.season = season;
        return this;
    }

    public Long getObsTime() {
        return obsTime;
    }

    public Fact setObsTime(Long obsTime) {
        this.obsTime = obsTime;
        return this;
    }

    @SerializedName("obs_time")
    private Long obsTime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fact{");
        sb.append("\n\t\ttemp=").append(temp);
        sb.append(", \n\t\tfeelsLike=").append(feelsLike);
        sb.append(", \n\t\ticon='").append(icon).append('\'');
        sb.append(", \n\t\tcondition='").append(condition).append('\'');
        sb.append(", \n\t\twindSpeed=").append(windSpeed);
        sb.append(", \n\t\twindGust=").append(windGust);
        sb.append(", \n\t\twindDir='").append(windDir).append('\'');
        sb.append(", \n\t\tpressureMm=").append(pressureMm);
        sb.append(", \n\t\tpressurePa=").append(pressurePa);
        sb.append(", \n\t\thumidity=").append(humidity);
        sb.append(", \n\t\tdaytime='").append(daytime).append('\'');
        sb.append(", \n\t\tpolar=").append(polar);
        sb.append(", \n\t\tseason='").append(season).append('\'');
        sb.append(", \n\t\tobsTime=").append(obsTime);
        sb.append('}');
        return sb.toString();
    }
}