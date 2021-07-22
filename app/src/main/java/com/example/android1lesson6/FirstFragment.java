package com.example.android1lesson6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
TextView tv;
RecyclerView rv;
ArrayList<ItemModel> dataHolder;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
           tv = view.findViewById(R.id.tv_text);
           rv = view.findViewById(R.id.rv);
           dataHolder = new ArrayList<>();

           ItemModel ob1 = new ItemModel("Kairat");
           ItemModel ob2 = new ItemModel("Rahat");
           ItemModel ob3 = new ItemModel("Aziz");
           ItemModel ob4 = new ItemModel("Nurgazy");
           ItemModel ob5 = new ItemModel("Elon");
           ItemModel ob6 = new ItemModel("Kioshi");
           ItemModel ob7 = new ItemModel("Aang");
           ItemModel ob8 = new ItemModel("Apolon");
           mkeSMTH();
        return view;

    }
    public void mkeSMTH(){
        RecyclerView.LayoutManager manager =  new LinearLayoutManager(requireActivity());


    }

}