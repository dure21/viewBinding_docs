package io.yagus.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import io.yagus.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.textView.setText("viewBinding 세팅 완료");
    }
}
