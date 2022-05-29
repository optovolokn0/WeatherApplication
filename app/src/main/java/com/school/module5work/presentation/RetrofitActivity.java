package com.school.module5work.presentation;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.school.module5work.API.APIConfig;
import com.school.module5work.API.APIService;
import com.school.module5work.API.APIServiceConstructor;
import com.school.module5work.R;
import com.school.module5work.data.ResponseData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RetrofitActivity extends AppCompatActivity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_retrofit);
		textView = findViewById(R.id.tw_weather);

		APIService service = APIServiceConstructor.CreateService(APIService.class);
		Call<ResponseData> call = service.getDataWeather(
				APIConfig.CITY_EKB_LAT,
				APIConfig.CITY_EKB_LON,
				APIConfig.LANG,
				APIConfig.API_YANDEX_KEY
		);

		call.enqueue(new Callback<ResponseData>() {
			@Override
			public void onResponse(@NonNull Call<ResponseData> call, @NonNull Response<ResponseData> response) {
				if (response.body() != null) {
					textView.setText(response.body().toString());
				}
			}

			@Override
			public void onFailure(@NonNull Call<ResponseData> call, @NonNull Throwable t) {
				textView.setText(t.toString());
			}
		});
	}

}