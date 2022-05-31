package com.school.module5work.API;

public interface APIServiceOkhttp {
    okhttp3.Request request = new okhttp3.Request.Builder()
            .url(APIConfig.HOST_URL)
            .post(requestBody)
            .addHeader("token", APIConfig.API_YANDEX_KEY)
            .build();
}
