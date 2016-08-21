package com.example.gagandeepbansal.myapplication;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gagandeepbansal.myapplication.model.EventModel;
import com.example.gagandeepbansal.myapplication.model.Photo;
import com.example.gagandeepbansal.myapplication.model.PhotoLongClickListener;
import com.example.gagandeepbansal.myapplication.model.PhotoTouchListener;

import java.util.List;

/**
 * Created by gagandeepbansal on 14-08-2016.
 */

public class PhotoViewHandler extends RecyclerView.ViewHolder {


    ImageView image;
    boolean isSelected;
    ImageView selectImage;
    PhotosFragment fragment;

    public  PhotoViewHandler(PhotosFragment fragment, View itemView, List<Photo> data) {
        super(itemView);
        image = (ImageView)itemView.findViewById(R.id.photo);
        selectImage = (ImageView)itemView.findViewById(R.id.selectImage);
//        selectImage.setScaleType(ImageView.ScaleType.FIT_XY);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        if (isSelected) {
            selectImage.setVisibility(View.VISIBLE);
        } else {
            selectImage.setVisibility(View.GONE);
        }
        this.fragment = fragment;

    }

    public void setData(Photo photo) {

        image.setImageResource(photo.getImageId());
        image.setOnClickListener(new PhotoTouchListener(fragment, photo.getImageId()));
        image.setOnLongClickListener(new PhotoLongClickListener(selectImage));
        isSelected = photo.isSelected();
    }
}
