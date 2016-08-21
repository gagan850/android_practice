package com.example.gagandeepbansal.myapplication;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by gagandeepbansal on 19-08-2016.
 */
public class SwipeAdaptor extends PagerAdapter {

    int[] image = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img7, R.drawable.img8};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public SwipeAdaptor (Context ctx) {
        this.ctx = ctx;
    }
    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view ==(LinearLayout)object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.content_photo_viewer, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.imageView);
        img.setImageResource(image[position]);
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
