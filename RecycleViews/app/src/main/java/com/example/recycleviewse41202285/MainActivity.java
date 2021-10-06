package com.example.recycleviewse41202285;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvClub;
    private ArrayList<Club> list = new ArrayList<>();
    //menmpilkan data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //memanggil super class
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memanggil widget

        rvClub = findViewById(R.id.rv_club);
        rvClub.setHasFixedSize(true);

        list.addAll(ClubData.getListData());
        showRecyclerList();
        //menambahkan data array pada tampilan
    }

    private void showRecyclerList(){
        rvClub.setLayoutManager(new LinearLayoutManager(this));
        ListClubAdapter listClubAdapter = new ListClubAdapter(list);
        rvClub.setAdapter(listClubAdapter);
        //menamplkan array
    }
}