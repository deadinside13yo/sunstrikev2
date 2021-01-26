package com.example.ukrasheniyaivanovkatri4ev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RingActivity extends AppCompatActivity {
    ListView listView;
    LayoutInflater layoutInflater;
    List<Decoration_list> decorList = new ArrayList<>();
    RingActivity.DecorListAdapter decorListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracer);
        Init();
        Add();
    }

    private void Add() {
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground, "ring", 12000));
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground,"ring", 12000));
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground,"ring", 12000));
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground, "ring", 12000));
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground,"ring", 12000));
        decorList.add(new Decoration_list(R.drawable.ring_icon_foreground,"ring", 12000));
    }

    private void Init() {

        listView=findViewById(R.id.listView);
        layoutInflater=layoutInflater.from(this);
        decorListAdapter = new RingActivity.DecorListAdapter();
        listView.setAdapter(decorListAdapter);

    }

    private class DecorListAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return decorList.size();
        }

        @Override
        public Decoration_list getItem(int position) {
            return decorList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Decoration_list rates=getItem(position);
            convertView=layoutInflater.inflate(R.layout.item_bracer,parent,false);

            ImageView Icon=convertView.findViewById(R.id.Icon);
            TextView Decoration=convertView.findViewById(R.id.Decoration);
            TextView Count=convertView.findViewById(R.id.Count);

            Icon.setImageResource(rates.getIcon());
            Decoration.setText(rates.getDecoration());
            Count.setText(String.valueOf(rates.getCount()));

            return convertView;
        }
    }
}
