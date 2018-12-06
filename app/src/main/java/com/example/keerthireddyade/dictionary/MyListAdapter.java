package com.example.keerthireddyade.dictionary;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.keerthireddyade.dictionary.R;

import java.util.ArrayList;

public class MyListAdapter extends ArrayAdapter<main2activity> {

    private Context context;


    public MyListAdapter(Activity context, ArrayList<main2activity> list) {
        super(context, 0, list );
        this.context=context;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View listItemView = view;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main2, parent, false);
        }

        final main2activity listItem=getItem(position);

        TextView textView =(TextView) listItemView.findViewById(R.id.item_definition);
        textView.setText(listItem.getDefinition());

        return listItemView;
    }
}

