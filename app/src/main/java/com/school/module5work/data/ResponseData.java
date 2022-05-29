package com.school.module5work.data;

import com.google.gson.annotations.SerializedName;

import com.school.module5work.data.datainfo.Fact;
import com.school.module5work.data.datainfo.Forecast;
import com.school.module5work.data.datainfo.Info;


public class ResponseData {
    @SerializedName("now")
    private Long now;
    @SerializedName("now_dt")
    private String nowDt;
    @SerializedName("info")
    private Info info;
    @SerializedName("fact")
    private Fact fact;
    @SerializedName("forecast")
    private Forecast forecast;

    public Long getNow() {
        return now;
    }

    public ResponseData setNow(Long now) {
        this.now = now;
        return this;
    }

    public String getNowDt() {
        return nowDt;
    }

    public ResponseData setNowDt(String nowDt) {
        this.nowDt = nowDt;
        return this;
    }

    public Info getInfo() {
        return info;
    }

    public ResponseData setInfo(Info info) {
        this.info = info;
        return this;
    }

    public Fact getFact() {
        return fact;
    }

    public ResponseData setFact(Fact fact) {
        this.fact = fact;
        return this;
    }

    public Forecast getForecast() {
        return forecast;
    }

    public ResponseData setForecast(Forecast forecast) {
        this.forecast = forecast;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ResponseData{\n");
        sb.append("now=").append(now);
        sb.append(", \nnowDt='").append(nowDt).append('\'');
        sb.append(", \ninfo=").append(info);
        sb.append(", \nfact=").append(fact);
        sb.append(", \nforecast=").append(forecast);
        sb.append('}');
        return sb.toString();
    }
}
