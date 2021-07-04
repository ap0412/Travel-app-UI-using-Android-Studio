package com.example.travelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class mainapp extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private LinearLayout europe,asia;
    ImageButton countries;
    TextView textcountry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainapp);
        utils.blackIconStatusBar(mainapp.this,R.color.white);
         europe=findViewById(R.id.europe);
         asia=findViewById(R.id.asia);
         countries=findViewById(R.id.countries);
         textcountry=findViewById(R.id.textcountry);
        countries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(mainapp.this, v);
                popup.setOnMenuItemClickListener(mainapp.this);
                popup.inflate(R.menu.popup_menu);
                popup.show();
            }
        });

    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.upload:
                textcountry.setText("Asia");
                europe.setVisibility(View.GONE);
                asia.setVisibility(View.VISIBLE);
                return true;
            case R.id.add1:
                textcountry.setText("Europe");
                europe.setVisibility(View.VISIBLE);
                asia.setVisibility(View.GONE);
                return true;

            case R.id.copy:
                textcountry.setText("America");
                europe.setVisibility(View.GONE);
                asia.setVisibility(View.GONE);
                return true;

            default:
                return false;
        }
    }

}