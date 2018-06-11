package com.example.nurda.bluetoothdemo;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class DeviceListAdapter extends ArrayAdapter<String> {


    public DeviceListAdapter(@NonNull Context context, int textViewResourceId, String[] objects) {
        super(context, textViewResourceId, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        TextView tv = (TextView) view.findViewById(android.R.id.text1);
        tv.setTextColor(Color.BLACK);
        return view;
    }
}
