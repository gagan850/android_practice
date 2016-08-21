package com.example.gagandeepbansal.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import static org.springframework.util.StringUtils.hasText;

public class MainActivity extends AppCompatActivity {

    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = (RelativeLayout) findViewById(R.id.layout);
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                in.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                return false;
            }
        });
    }


    public void onClickLogin(View view) {

        if (view.getId() == R.id.login_btn) {
            EditText userName = (EditText)findViewById(R.id.user_name_txt);
            EditText password = (EditText)findViewById(R.id.password_txt);

            if (!hasText(userName.getText().toString())) {
                Toast.makeText(getApplicationContext(), "Username is Empty", Toast.LENGTH_SHORT).show();
                return;
            }
            if (!hasText(password.getText().toString())) {
                Toast.makeText(getApplicationContext(), "Password is Empty", Toast.LENGTH_SHORT).show();
                return;
            }
//            Intent intent = new Intent(this, UpcomingEventActivity.class);
//            startActivity(intent);
//

            Intent intent = new Intent(this, UpcomingEvents.class);
            startActivity(intent);
        }

    }


    public void onClickCreateNew(View view) {
        Intent intent = new Intent(this, RegisterUserActivity.class);
        startActivity(intent);
    }
}


