package com.example.animelist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimeDescriptionAdapted extends RecyclerView.Adapter<AnimeDescriptionAdapted.AnimeDescriptionViewHolder> {

    public ArrayList<AnimeDescriptionItem> animeDescriptionItems;
    public Context context;

    public AnimeDescriptionAdapted(ArrayList<AnimeDescriptionItem> animeDescriptionItems, Context context) {
        this.animeDescriptionItems = animeDescriptionItems;
        this.context = context;
    }

    public class AnimeDescriptionViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView poster;
        public TextView title;
        public TextView description;

        public AnimeDescriptionViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            poster = itemView.findViewById(R.id.animeImageView);
            title = itemView.findViewById(R.id.titleImageView);
            description = itemView.findViewById(R.id.descriptionImageView);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            AnimeDescriptionItem animeDescriptionItem = animeDescriptionItems.get(position);
            Intent intent = new Intent(context, DescriptionActivity.class);
            intent.putExtra("title", animeDescriptionItem.getTitle());
            intent.putExtra("fullDescription", animeDescriptionItem.getFullDescription());
            context.startActivity(intent);
        }
    }

    @NonNull
    @Override
    public AnimeDescriptionAdapted.AnimeDescriptionViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_description_item, parent, false);
        AnimeDescriptionViewHolder holder = new AnimeDescriptionViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeDescriptionViewHolder holder, int position) {
        AnimeDescriptionItem animeDescriptionItem = animeDescriptionItems.get(position);
        holder.poster.setImageResource(animeDescriptionItem.getImageResource());
        holder.title.setText(animeDescriptionItem.getTitle());
        holder.description.setText(animeDescriptionItem.getDescription());
    }

    @Override
    public int getItemCount() {
        return animeDescriptionItems.size();
    }
}
