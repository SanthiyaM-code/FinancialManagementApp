package com.finance.financeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.finance.financeapp.ui.main.ProductFragment;

public class product extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, ProductFragment.newInstance())
                    .commitNow();
        }
    }
}