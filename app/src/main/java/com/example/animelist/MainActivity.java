package com.example.animelist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public RecyclerView.Adapter adapter;
    public RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<AnimeDescriptionItem> animeDescriptionItems = new ArrayList<>();
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_1, Utils.TITLE_1, Utils.EPISODES_1, Utils.SUBTITLE_1));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_2, Utils.TITLE_2, Utils.EPISODES_2, Utils.SUBTITLE_2));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_3, Utils.TITLE_3, Utils.EPISODES_3, Utils.SUBTITLE_3));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_4, Utils.TITLE_4, Utils.EPISODES_4, Utils.SUBTITLE_4));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_5, Utils.TITLE_5, Utils.EPISODES_5, Utils.SUBTITLE_5));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_6, Utils.TITLE_6, Utils.EPISODES_6, Utils.SUBTITLE_6));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_7, Utils.TITLE_7, Utils.EPISODES_7, Utils.SUBTITLE_7));
        animeDescriptionItems.add(new AnimeDescriptionItem(R.drawable.anime_8, Utils.TITLE_8, Utils.EPISODES_8, Utils.SUBTITLE_8));
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new AnimeDescriptionAdapted(animeDescriptionItems,this);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}