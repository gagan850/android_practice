package com.example.gagandeepbansal.myapplication;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gagandeepbansal.myapplication.model.EventModel;

/**
 * Created by gagandeepbansal on 13-08-2016.
 */

public class EventModelViewHandler extends RecyclerView.ViewHolder {

    TextView event_address;
    TextView event_date;
    TextView event_time;
    ImageView image;

    public EventModelViewHandler(View itemView) {
        super(itemView);
        event_address = (TextView) itemView.findViewById(R.id.event_address);
        event_date = (TextView) itemView.findViewById(R.id.event_date);
        event_time = (TextView) itemView.findViewById(R.id.event_time);
        image = (ImageView)itemView.findViewById(R.id.event_image);
        image.setScaleType(ImageView.ScaleType.FIT_XY);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(v.getContext(), UpcomingEventActivity.class);
                v.getContext().startActivity(intent);
            }
        });
    }

    public void setData(EventModel model) {
        event_address.setText(model.getAddress());
        event_date.setText(model.getDate());
        event_time.setText(model.getTime());
        image.setImageResource(model.getImage());
    }
}
