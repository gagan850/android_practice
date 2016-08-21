package com.example.gagandeepbansal.myapplication.model;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.example.gagandeepbansal.myapplication.PhotoViewer;
import com.example.gagandeepbansal.myapplication.PhotosFragment;

/**
 * Created by gagandeepbansal on 19-08-2016.
 */
public class PhotoTouchListener implements View.OnClickListener{

    PhotosFragment fragment;

    int imageId;
    public PhotoTouchListener (PhotosFragment fragment, int imageId) {
        this.fragment = fragment;
        this.imageId = imageId;
    }


    @Override
    public void onClick(View v) {
        ImageView view = (ImageView) v;
        if (imageId != 0) {
//            Bitmap bitMap = BitmapFactory.decodeResource(fragment.getResources(), imageId);
//            Matrix mat = new Matrix();
//            mat.postRotate(90);
//            Bitmap bMapRotate = Bitmap.createBitmap(bitMap, 0, 0, bitMap.getWidth(), bitMap.getHeight(), mat, true);
//            view.setImageBitmap(bMapRotate);

            Intent intent = new Intent(fragment.getActivity(), PhotoViewer.class);
            fragment.getActivity().startActivity(intent);
        }
    }
}
