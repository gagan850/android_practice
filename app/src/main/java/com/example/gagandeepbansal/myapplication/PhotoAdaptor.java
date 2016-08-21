package com.example.gagandeepbansal.myapplication;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gagandeepbansal.myapplication.model.EventModel;
import com.example.gagandeepbansal.myapplication.model.Photo;

import java.util.List;

/**
 * Created by gagandeepbansal on 13-08-2016.
 */
public class PhotoAdaptor extends RecyclerView.Adapter<PhotoViewHandler> {

    private List<Photo> data;
    private LayoutInflater layout;
    private PhotosFragment fragment;

    public PhotoAdaptor(Context context, List<Photo> data, PhotosFragment fragment) {
        this.layout = LayoutInflater.from(context);
        this.data = data;
        this.fragment = fragment;
    }

    @Override
    public PhotoViewHandler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = layout.inflate(R.layout.list_photos, parent, false);
        PhotoViewHandler holder = new PhotoViewHandler(fragment, view, data);
        return holder;
    }

    @Override
    public void onBindViewHolder(PhotoViewHandler holder, int position) {

        Photo event = data.get(position);
        holder.setData(event);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
