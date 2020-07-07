package com.example.topgamesapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class FortniteFragment extends Fragment {


    public FortniteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fortnite, container, false);
        Button btnConfig = (Button) view.findViewById(R.id.buttonConfigsFortnite);
        Button btnDetails = (Button) view.findViewById(R.id.buttonDetailsFortnite);
        Button btnWeb = (Button) view.findViewById(R.id.buttonWebFortnite);

        btnDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), FortniteDetailsActivity.class);
                startActivity(in);
            }
        });

        btnConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), RecyclerConfigs.class);
                startActivity(in);
            }
        });

        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(getActivity(), WebActivity.class);
                in.putExtra("Pokusaj", 1);
                startActivity(in);
            }
        });
        return view;
    }

}
