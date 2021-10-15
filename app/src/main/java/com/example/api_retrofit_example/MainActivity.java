package com.example.api_retrofit_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.api_retrofit_example.Adapters.ItemAdapter;
import com.example.api_retrofit_example.Models.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List list = new ArrayList();
        list.add(new Item(102,R.drawable.ic_launcher_background,"ali",150,"ali things"));

        recyclerView = findViewById(R.id.recyclerView);
        ItemAdapter itemAdapter = new ItemAdapter(list);//Adding List
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(itemAdapter);
    }
}