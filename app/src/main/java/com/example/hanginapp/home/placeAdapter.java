package com.example.hanginapp.home;

import android.content.Context;
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
    private Context context;

    public placeAdapter(List<Place> places, Context context) {
        this.places = places;
        this.context = context;
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

    }

    @Override
    public int getItemCount() {
        return places.size();
    }
}
