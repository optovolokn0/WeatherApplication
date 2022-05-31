package com.school.module5work.data.datainfo;

import androidx.annotation.NonNull;

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
        // Перевод фразы
        // clear — ясно.
        // partly-cloudy — малооблачно.
        // cloudy — облачно с прояснениями.
        // overcast — пасмурно.
        // drizzle — морось.
        // light-rain — небольшой дождь.
        // rain — дождь.
        // moderate-rain — умеренно сильный дождь.
        // heavy-rain — сильный дождь.
        // continuous-heavy-rain — длительный сильный дождь.
        // showers — ливень.
        // wet-snow — дождь со снегом.
        // light-snow — небольшой снег.
        // snow — снег.
        // snow-showers — снегопад.
        // hail — град.
        // thunderstorm — гроза.
        // thunderstorm-with-rain — дождь с грозой.
        // thunderstorm-with-hail — гроза с градом.

        if (this.condition.equals("overcast"))
            this.condition = "Пасмурно";
        if (this.condition.equals("clear"))
            this.condition = "Ясно";
        if (this.condition.equals("partly-cloudy"))
            this.condition = "Малооблачно";
        if (this.condition.equals("cloudy"))
            this.condition = "Облачно с прояснениями";
        if (this.condition.equals("drizzle"))
            this.condition = "Морось";
        if (this.condition.equals("light-rain"))
            this.condition = "Небольшой дождь";
        if (this.condition.equals("rain"))
            this.condition = "Дождь";
        if (this.condition.equals("moderate-rain"))
            this.condition = "Умеренно сильный дождь";
        if (this.condition.equals("heavy-rain"))
            this.condition = "Сильный дождь";
        if (this.condition.equals("continuous-heavy-rain"))
            this.condition = "Длительный сильный дождь";
        if (this.condition.equals("showers"))
            this.condition = "Ливень";
        if (this.condition.equals("wet-snow"))
            this.condition = "Дождь со снегом";
        if (this.condition.equals("light-snow"))
            this.condition = "Небольшой снег";
        if (this.condition.equals("snow"))
            this.condition = "Снег";
        if (this.condition.equals("snow-showers"))
            this.condition = "Снегопад";
        if (this.condition.equals("hail"))
            this.condition = "Град";
        if (this.condition.equals("thunderstorm"))
            this.condition = "Гроза";
        if (this.condition.equals("thunderstorm-with-rain"))
            this.condition = "Дождь с грозой";
        if (this.condition.equals("thunderstorm-with-hail"))
            this.condition = "Гроза с градом";

        return this.condition;
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
        // Рсшифровка фразы
        //«n» — северное.
        //«ne» — северо-восточное.
        //«e» — восточное.
        //«se» — юго-восточное.
        //«s» — южное.
        //«sw» — юго-западное.
        //«w» — западное.
        //«с» — штиль.

        if (this.windDir.equals("nw")) this.windDir = "северо-западное";
        if (this.windDir.equals("ne")) this.windDir = "северо-восточное";
        if (this.windDir.equals("e")) this.windDir = "восточное";
        if (this.windDir.equals("se")) this.windDir = "юго-восточное";
        if (this.windDir.equals("sw")) this.windDir = "юго-западное";
        if (this.windDir.equals("w")) this.windDir = "западное";
        if (this.windDir.equals("c")) this.windDir = "штиль";
        if (this.windDir.equals("n")) this.windDir = "северное";
        if (this.windDir.equals("s")) this.windDir = "южное";

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

    @NonNull
    @Override
    public String toString() {
        return "Температура " + temp + "°C" +
                "\n" + getCondition() +
                "\nОщущается как " + feelsLike + "°C" +
                "\nСкорость ветра " + windSpeed + " м/с" +
                "\nС порывами до " + windGust + " м/с" +
                "\nНаправление ветра " + getWindDir() +
                "\nДавление " + pressureMm + " мм.рт.ст. (" + pressurePa + " ГПа)" +
                "\nВлажность " + humidity + '%';
    }
}