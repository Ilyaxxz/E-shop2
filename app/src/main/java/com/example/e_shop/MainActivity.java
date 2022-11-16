package com.example.e_shop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.e_shop.adapter.CategoryAdapter;
import com.example.e_shop.adapter.DotaAdapter;
import com.example.e_shop.model.Category;
import com.example.e_shop.model.Dota;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView categoryRecycler, dotaRecycler;
    CategoryAdapter categoryAdapter;
    DotaAdapter dotaAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category(1, "Предметы"));
        categoryList.add(new Category(2,"Обучение"));
        categoryList.add(new Category(3, "Буст"));
        categoryList.add(new Category(4,"Акции"));

        setCategoryRecycler(categoryList);

        List<Dota> dotaList = new ArrayList<>();
        dotaList.add(new Dota(1, "rubick", "The Magus Cypher", "Arcana", "1500р."));
        dotaList.add(new Dota(2, "pudge", "The Abscesserator","Immortal", "400р."));

        setDotaRecycler(dotaList);
    }

    private void setDotaRecycler(List<Dota> dotaList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        dotaRecycler = findViewById(R.id.dotaRecycler);
        dotaRecycler.setLayoutManager(layoutManager);

        dotaAdapter = new DotaAdapter(this, dotaList);
        dotaRecycler.setAdapter(dotaAdapter);
    }

    private void setCategoryRecycler(List<Category> categoryList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);

        categoryRecycler = findViewById(R.id.categoryRecycler);
        categoryRecycler.setLayoutManager(layoutManager);

        categoryAdapter = new CategoryAdapter(this, categoryList);
        categoryRecycler.setAdapter(categoryAdapter);

    }
}