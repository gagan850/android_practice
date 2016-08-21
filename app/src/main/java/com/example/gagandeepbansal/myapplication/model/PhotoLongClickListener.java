package com.example.gagandeepbansal.myapplication.model;

import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by gagandeepbansal on 18-08-2016.
 */
public class PhotoLongClickListener implements View.OnLongClickListener{

    private ImageView selectImage;

    int visible = View.VISIBLE;

    int gone = View.GONE;

    List<Photo> data;
    public PhotoLongClickListener (ImageView image) {
        this.selectImage = image;
//        this.data = data;
    }

    @Override
    public boolean onLongClick(View v) {
        Snackbar snackbar;
        int visibility = selectImage.getVisibility();
        if (visibility == visible) {
            selectImage.setVisibility(gone);
            snackbar = Snackbar
                    .make(v, "Image is Unselected", Snackbar.LENGTH_LONG)
                    .setAction("unselect all", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                            unselectAll(data);
//                            Snackbar snackbar1 = Snackbar.make(view, "Message is restored!", Snackbar.LENGTH_SHORT);
//                            snackbar1.show();
                        }
                    });

        } else {
            selectImage.setVisibility(visible);
            snackbar = Snackbar
                    .make(v, "Image is selected", Snackbar.LENGTH_LONG)
                    .setAction("select all", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
//                              selectAll(data);
//                            Snackbar snackbar1 = Snackbar.make(view, "Message is restored!", Snackbar.LENGTH_SHORT);
//                            snackbar1.show();
                        }
                    });
        }


        snackbar.show();
        return true;
    }

//    public void selectAll(List<Photo> data) {
//        for (Photo photo : data) {
//            photo.setSelected(true);
//        }
//    }
//
//
//    public void unselectAll(List<Photo> data) {
//        for (Photo photo : data) {
//            photo.setSelected(false);
//        }
//    }
}
