package com.example.ukrasheniyaivanovkatri4ev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private LayoutInflater inflater;
    private List<Decoration_list> decorlist;

    DataAdapter(Context context, List<Decoration_list> decorlist) {
        this.decorlist = decorlist;
        this.inflater = LayoutInflater.from(context);
    }
    @NonNull
    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item_bracer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Decoration_list decorList = decorlist.get(position);
        holder.countView.setText(decorList.getCount());
        holder.decorView.setText(decorList.getDecoration());
        holder.imageView.setImageResource(decorList.getIcon());
    }

    @Override
    public int getItemCount() {
        return decorlist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView decorView;
        final TextView countView;
        ViewHolder(View view){
            super(view);
            imageView = (ImageView)view.findViewById(R.id.Icon);
            decorView = (TextView) view.findViewById(R.id.DecorTextView);
            countView = (TextView) view.findViewById(R.id.CountTextView);
        }
    }
}
