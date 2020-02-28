package com.example.hanginapp.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hanginapp.R;
import com.example.hanginapp.models.Place;

import java.util.List;

public class placeAdapter extends RecyclerView.Adapter<PlaceHolder> {

    private List<Place>places;
    private PlaceItemClick placeItemClick;

    public placeAdapter(List<Place> places, PlaceItemClick placeItemClick) {
        this.places = places;
        this.placeItemClick = placeItemClick;
    }

    @NonNull
    @Override
    public PlaceHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.acivity_item,parent,false);
        return new PlaceHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PlaceHolder holder, int position) {
        Place place=places.get(position);
        holder.ViewBind(place);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeItemClick.OnItemClicked(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return places.size();
    }
}
