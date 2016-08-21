package com.example.gagandeepbansal.myapplication.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gagandeepbansal on 14-08-2016.
 */
public class Photo {
    private int imageId;
    private boolean isSelected;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static List<Photo> getPhotos(int[] image) {

        List photos = new ArrayList<Photo>();
        for (int i=0;i<5;i++) {
            Photo photo = new Photo();
            photo.setImageId(image[i]);
            photos.add(photo);
        }
        return photos;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
