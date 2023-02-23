package com.example.animelist;

public class AnimeDescriptionItem {

    private int imageResource;
    private String title;
    private String description;
    private String fullDescription;

    public AnimeDescriptionItem(int imageResource, String title, String description, String fullDescription) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.fullDescription = fullDescription;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getFullDescription() {
        return fullDescription;
    }
}
