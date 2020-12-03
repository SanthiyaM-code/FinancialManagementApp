package com.finance.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.finance.financeapp.ui.main.SettingssFragment;

public class settingss extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingss_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, SettingssFragment.newInstance())
                    .commitNow();
        }
    }
}