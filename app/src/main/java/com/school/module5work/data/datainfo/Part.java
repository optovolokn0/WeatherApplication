package com.school.module5work.data.datainfo;

import com.google.gson.annotations.SerializedName;

public class Part {

    @SerializedName("part_name")
    public String partName;
    @SerializedName("temp_min")
    public Long tempMin;
    @SerializedName("temp_max")
    public Long tempMax;
    @SerializedName("temp_avg")
    public Long tempAvg;
    @SerializedName("feels_like")
    public Long feelsLike;
    @SerializedName("icon")
    public String icon;
    @SerializedName("condition")
    public String condition;
    @SerializedName("daytime")
    public String daytime;
    @SerializedName("polar")
    public Boolean polar;
    @SerializedName("wind_speed")
    public Double windSpeed;
    @SerializedName("wind_gust")
    public Long windGust;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("pressure_mm")
    public Long pressureMm;
    @SerializedName("pressure_pa")
    public Long pressurePa;
    @SerializedName("humidity")
    public Long humidity;
    @SerializedName("prec_mm")
    public Long precMm;
    @SerializedName("prec_period")
    public Long precPeriod;
    @SerializedName("prec_prob")
    public Long precProb;
}
