package com.school.module5work.presentation;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.school.module5work.API.APIConfig;
import com.school.module5work.R;
import com.school.module5work.data.ResponseData;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkhttpActivity extends AppCompatActivity {
	private TextView textView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_okhttp);
		textView = findViewById(R.id.tw_weather12);

		OkHttpClient client = new OkHttpClient().newBuilder().build();
		okhttp3.Request request = new Request.Builder()
				.url(APIConfig.HOST_URL+"v2/informers?lat="+APIConfig.CITY_LAT+"&lon="+APIConfig.CITY_LON)
				.method("GET", null)
				.addHeader("X-Yandex-API-Key", APIConfig.API_YANDEX_KEY)
				.addHeader("Content-Type", "application/json")
				.build();
		client.newCall(request).enqueue(new okhttp3.Callback() {
			@Override
			public void onResponse(@NonNull Call call, @NonNull Response response) throws IOException {
				if(response.body()!=null){
					ResponseData responseData = new Gson().fromJson(response.body().string(), ResponseData.class);
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							textView.setText(responseData.toString());
						}
					});
				} else textView.setText("Пустой запрос OkHttp");
			}

			@Override
			public void onFailure(@NonNull Call call, @NonNull IOException e) {
				textView.setText("OkHttp Failure");
			}
		});
	}
}
