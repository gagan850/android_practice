package com.example.gagandeepbansal.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.gagandeepbansal.myapplication.model.EventModel;

import de.hdodenhof.circleimageview.CircleImageView;

public class UpcomingEvents extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_events);

        Intent intent = getIntent();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Upcoming Events");
        String title = intent.getStringExtra("title");
        if (title != null) {
            toolbar.setTitle(title);
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        drawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open, R.string.close);

        NavigationView nv = (NavigationView)findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(this);
        LinearLayout view = (LinearLayout) nv.getHeaderView(0);
        CircleImageView drawerProfile = (CircleImageView) view.findViewById(R.id.profile_pic);
        drawerProfile.setImageResource(R.drawable.img1);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();


        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        int[] image = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img7, R.drawable.img8};
        RecyclerAdaptor adaptor = new RecyclerAdaptor(this, EventModel.getEvents(image));
        recyclerView.setAdapter(adaptor);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
//        GridLayoutManager glm = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(llm);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.dashboard:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent dashboard = new Intent(this, UpcomingEvents.class);
                startActivity(dashboard);
                break;

            case R.id.create_event:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent createEvent = new Intent(this, UpcomingEvents.class);
                createEvent.putExtra("title","Create Event");
                startActivity(createEvent);

                break;

            case R.id.my_events:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent myEvent = new Intent(this, UpcomingEvents.class);
                myEvent.putExtra("title","My Events");
                startActivity(myEvent);
                break;

            case R.id.invitations:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent invitations = new Intent(this, UpcomingEvents.class);
                invitations.putExtra("title","Invitations");
                startActivity(invitations);
                break;

            case R.id.past_events:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent past_events = new Intent(this, UpcomingEvents.class);
                past_events.putExtra("title","Past Events");
                startActivity(past_events);
                break;

            case R.id.logout:
                item.setChecked(true);
                drawerLayout.closeDrawers();
                Intent logout = new Intent(this, MainActivity.class);
                startActivity(logout);
                break;
        }
        return true;
    }
}