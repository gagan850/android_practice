package com.example.gagandeepbansal.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gagandeepbansal.myapplication.model.EventModel;

import java.util.List;

/**
 * Created by gagandeepbansal on 13-08-2016.
 */
public class RecyclerAdaptor extends RecyclerView.Adapter<EventModelViewHandler> {

    private List<EventModel> data;
    private LayoutInflater layout;

    public RecyclerAdaptor(Context context, List<EventModel> data) {
        this.layout = LayoutInflater.from(context);
        this.data = data;
    }

    @Override
    public EventModelViewHandler onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = layout.inflate(R.layout.list_events, parent, false);
        EventModelViewHandler holder = new EventModelViewHandler(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(EventModelViewHandler holder, int position) {

        EventModel event = data.get(position);
        holder.setData(event);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
