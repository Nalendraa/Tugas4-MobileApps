package com.example.autocomplatetext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
        String[] arr={"Java","Phyton","C++","Ruby","Kotlin","PHP","Javascript","Goolang", "Swift"};
        //deklarasi array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item,arr);
        //menampilkan data array

        autoCompleteTextView.setThreshold(1);
        //meanmpilkan saran dengan satu huruf
        autoCompleteTextView.setAdapter(adapter);
        //setting adapter

    }
}