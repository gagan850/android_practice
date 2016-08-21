package com.example.gagandeepbansal.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ActionProvider;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class UpcomingEventActivity extends AppCompatActivity implements DetailsFragment.OnFragmentInteractionListener, CommentsFragment.OnFragmentInteractionListener, PhotosFragment.OnFragmentInteractionListener, NavigationView.OnNavigationItemSelectedListener{

    private Toolbar toolbar;
    private TabLayout tabLayout;
private ActionBarDrawerToggle drawerToggle;
    DrawerLayout drawerLayout;
    Intent mShareIntent;
    Menu optionMenu;
    ShareActionProvider mShareActionProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upcoming_event);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        NavigationView nv = (NavigationView)findViewById(R.id.navigation_view);
        nv.setNavigationItemSelectedListener(this);
        LinearLayout view = (LinearLayout) nv.getHeaderView(0);
        CircleImageView drawerProfile = (CircleImageView) view.findViewById(R.id.profile_pic);
        drawerProfile.setImageResource(R.drawable.img1);
        drawerLayout =(DrawerLayout)findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        mShareIntent = new Intent();
        mShareIntent.setAction(Intent.ACTION_SEND);
        mShareIntent.setType("text/plain");
        mShareIntent.putExtra(Intent.EXTRA_TEXT, "From me to you, this text is new.");

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.addTab(tabLayout.newTab().setText("Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Comments"));
        tabLayout.addTab(tabLayout.newTab().setText("Photos"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getText().equals("Details")) {
                    optionMenu.findItem(R.id.share).setVisible(true);
                    optionMenu.findItem(R.id.download).setVisible(false);
                    optionMenu.findItem(R.id.delete).setVisible(false);
                    optionMenu.findItem(R.id.invite_friends).setVisible(true);
                    optionMenu.findItem(R.id.camera).setVisible(false);
                    optionMenu.findItem(R.id.attach).setVisible(false);
                } else if (tab.getText().equals("Comments")) {
                    optionMenu.findItem(R.id.share).setVisible(false);
                    optionMenu.findItem(R.id.download).setVisible(false);
                    optionMenu.findItem(R.id.delete).setVisible(false);
                    optionMenu.findItem(R.id.invite_friends).setVisible(false);
                    optionMenu.findItem(R.id.camera).setVisible(false);
                    optionMenu.findItem(R.id.attach).setVisible(false);
                } else {
                    optionMenu.findItem(R.id.share).setVisible(true);
                    optionMenu.findItem(R.id.download).setVisible(true);
                    optionMenu.findItem(R.id.delete).setVisible(true);
                    optionMenu.findItem(R.id.invite_friends).setVisible(false);
                    optionMenu.findItem(R.id.camera).setVisible(true);
                    optionMenu.findItem(R.id.attach).setVisible(true);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void setupViewPager(ViewPager viewPager) {

        List<Fragment> fragmentList = new ArrayList<Fragment>();
        fragmentList.add(new DetailsFragment());
        fragmentList.add(new CommentsFragment());
        fragmentList.add(new PhotosFragment());

        List<String> fragmentTitles = new ArrayList<String>();
        fragmentTitles.add("Details");
        fragmentTitles.add("Comments");
        fragmentTitles.add("Photos");

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(), fragmentList, fragmentTitles);
        viewPager.setAdapter(adapter);

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

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


    class ViewPagerAdapter extends FragmentPagerAdapter {
        private List<Fragment> fragmentList;
        private List<String> fragmentTitles;


        public ViewPagerAdapter(FragmentManager manager, List<Fragment> fragmentList, List<String> fragmentTitles) {
            super(manager);
            this.fragmentList = fragmentList;
            this.fragmentTitles = fragmentTitles;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentTitles.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitles.get(position);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        optionMenu = menu;
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menu) {
        switch (menu.getItemId()) {

            case R.id.download:
                Drawable drawable = getResources().getDrawable(R.drawable.img1);

                Bitmap bitmap = ((BitmapDrawable)drawable).getBitmap();

                String ImagePath = MediaStore.Images.Media.insertImage(getContentResolver(),
                        bitmap,
                        "demo_image",
                        "demo_image"
                );

                Uri URI = Uri.parse(ImagePath);

                Toast.makeText(this,"Image Saved Successfully", Toast.LENGTH_LONG).show();
            break;

            case R.id.delete:
                Toast.makeText(this,"Option 1 Selected", Toast.LENGTH_SHORT).show();
                break;

            case R.id.share:
                Intent shareIntent =
                        new Intent(android.content.Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(android.content.Intent.EXTRA_SUBJECT,
                        "Insert Subject Here");
                String shareMessage = "Insert message body here.";
                shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,
                        shareMessage);
                startActivity(Intent.createChooser(shareIntent,
                        "Share via"));            break;

            case R.id.camera:
            Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(intent);
                break;

            case R.id.attach:
                Intent attachIntent = new Intent();
                attachIntent.setType("image/*");
                attachIntent.setAction(Intent.ACTION_GET_CONTENT);//
                startActivity(Intent.createChooser(attachIntent, "Select File"));
                break;

            case R.id.invite_friends:
                android.app.FragmentManager manager = this.getFragmentManager();
                //this.context.getSupportFragmentManager();
                InviteGuestDialog dialog = new InviteGuestDialog();
                dialog.show(manager, "InviteGuestDialog");
                break;
        }
        return super.onOptionsItemSelected(menu);
    }


}