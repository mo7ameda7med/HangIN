package com.example.hanginapp.models;

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
}
