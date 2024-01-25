package com.emirhanustun.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
    }

    public void hot_coffee(View view) {
        startActivity(new Intent(MenuActivity.this, HotCoffeeActivity.class));
    }

    public void cold_coffee(View view) {
        startActivity(new Intent(MenuActivity.this, ColdCoffeeActivity.class));
    }

    public void tea(View view) {
        startActivity(new Intent(MenuActivity.this, TeaActivity.class));
    }

    public void cold_drinks(View view) {
        startActivity(new Intent(MenuActivity.this, ColdDrinksActivity.class));
    }

    public void desserts(View view) {
        startActivity(new Intent(MenuActivity.this, DessertsActivity.class));
    }


}