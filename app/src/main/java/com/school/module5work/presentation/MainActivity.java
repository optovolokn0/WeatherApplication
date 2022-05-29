package com.school.module5work.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.school.module5work.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Objects.requireNonNull(getSupportActionBar()).hide();
		setContentView(R.layout.activity_main);

		Button buttonRetrofit = findViewById(R.id.retrofit);
		buttonRetrofit.setOnClickListener(view -> {
			Intent intent = new Intent(view.getContext(), RetrofitActivity.class);
			view.getContext().startActivity(intent);});

		Button buttonOkhttp = findViewById(R.id.okhttp);
		buttonOkhttp.setOnClickListener(view -> {
			Intent intent = new Intent(view.getContext(), OkhttpActivity.class);
			view.getContext().startActivity(intent);});
	}
}