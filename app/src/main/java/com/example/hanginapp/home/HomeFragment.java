package com.example.hanginapp.home;


import android.app.Fragment;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hanginapp.R;
import com.example.hanginapp.models.Place;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_home,container,false);
        recyclerView= view.findViewById(R.id.home_recycler_view);
        List<Place>places=new ArrayList<>();

        places.add(new Place("", "Name 1", "Address 1", 2.5F));
        places.add(new Place("", "Name 2", "Address 2", 2.5F));
        places.add(new Place("", "Name 1", "Address 1", 2.5F));
        places.add(new Place("", "Name 2", "Address 2", 2.5F));

        placeAdapter placeAdapter=new placeAdapter(places,getActivity());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(placeAdapter);

        return view;


    }

}
