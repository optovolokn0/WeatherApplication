package com.school.module5work.presentation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.school.module5work.API.APIConfig;
import com.school.module5work.R;

import java.io.IOException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;

public class OkhttpActivity extends AppCompatActivity {
	private TextView textView;
	private final OkHttpClient client = new OkHttpClient();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_okhttp);
		textView = findViewById(R.id.tw_weather);

		RequestBody requestBody = new MultipartBody.Builder()
				.setType(MultipartBody.FORM)
				.addFormDataPart("search", "a")
				.addFormDataPart("model", "1")
				.addFormDataPart("in", "1")
				.addFormDataPart("id", "1")
				.build();

		okhttp3.Request request = new okhttp3.Request.Builder()
				.url(APIConfig.HOST_URL)
				.post(requestBody)
				.addHeader("token", APIConfig.API_YANDEX_KEY)
				.build();

		client.newCall(request).enqueue(new Callback() {
			@Override
			public void onResponse(@NonNull Call call,
								   @NonNull okhttp3.Response response) {
				textView.setText(Objects.requireNonNull(response.body()).toString());
			}

			@Override
			public void onFailure(@NonNull Call call,
								  @NonNull IOException e) {
				textView.setText(e.toString());
			}
		});
	}
}
