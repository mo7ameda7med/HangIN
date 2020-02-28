package com.example.hanginapp.models;

import android.widget.ImageView;

import com.example.hanginapp.R;
import com.squareup.picasso.Picasso;

public class Place {

    private String image;
    private String name;
    private String location;
    private float rating;

    public Place(String image, String name, String location, float rating) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public float getRating() {
        return rating;
    }

    public void LoadImage(ImageView imageView)
    {
        Picasso.get().load(getImage()).placeholder(R.drawable.appicon).error(R.drawable.appicon).into(imageView);

    }
}
