package com.example.hanginapp.home;

import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hanginapp.R;
import com.example.hanginapp.models.Place;

public class PlaceHolder extends RecyclerView.ViewHolder {
    private ImageView ImageView;
    private TextView name;
    private TextView location;
    private RatingBar ratingBar;



    public PlaceHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    void initView(View view){
        ImageView=view.findViewById(R.id.item_image_circle_view);
        name=view.findViewById(R.id.item_name_place);
        location=view.findViewById(R.id.item_text_location);
        ratingBar=view.findViewById(R.id.rating_bar);
    }

    void ViewBind(Place place)
    {
        name.setText(place.getName());
        location.setText(place.getLocation());
        ratingBar.setRating(place.getRating());
    }
}
