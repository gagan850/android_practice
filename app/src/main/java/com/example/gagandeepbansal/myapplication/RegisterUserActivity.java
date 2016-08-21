package com.example.gagandeepbansal.myapplication;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.*;
import android.widget.DatePicker;
import org.springframework.util.StringUtils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import static org.springframework.util.StringUtils.*;


public class RegisterUserActivity extends AppCompatActivity {

    RelativeLayout layout;
    AutoCompleteTextView autoCompleteTextView;
    String[] sex;

    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_user);

        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.sex_txt);
        sex = getResources().getStringArray(R.array.sex);
        ArrayAdapter<String> cityNamesAdaptor = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,
                sex);
        autoCompleteTextView.setAdapter(cityNamesAdaptor);
        layout = (RelativeLayout) findViewById(R.id.layout);
        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                        InputMethodManager in = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                        in.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
                        return false;
    }});
        }


    public void onClickDOB(View view) {

        Calendar currentDate = Calendar.getInstance();
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                EditText dob = (EditText) findViewById(R.id.dob_txt);
                SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy");
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                dob.setText(dateFormatter.format(newDate.getTime()));
            }
        }, currentDate.get(Calendar.YEAR), currentDate.get(Calendar.MONTH), currentDate.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    public void onClickSignUp(View view) {
        EditText name= (EditText)findViewById(R.id.name_txt);
        AutoCompleteTextView sex= (AutoCompleteTextView)findViewById(R.id.sex_txt);
        EditText dob= (EditText)findViewById(R.id.dob_txt);
        EditText emailId= (EditText)findViewById(R.id.email_txt);
        EditText city= (EditText)findViewById(R.id.city_txt);
        EditText contactNumber= (EditText)findViewById(R.id.contact_number_txt);
        EditText password= (EditText)findViewById(R.id.password_txt);
        EditText confirmPassword= (EditText)findViewById(R.id.confirm_password_txt);

        if (!hasText(name.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Name is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(sex.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Sex is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(dob.getText().toString())) {
            Toast.makeText(getApplicationContext(), "DOB is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(emailId.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Email Id is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(city.getText().toString())) {
            Toast.makeText(getApplicationContext(), "City is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(contactNumber.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Contact Number is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(password.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Password is Empty", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!hasText(confirmPassword.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Confirm Password is Empty", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent intent = new Intent(this, UpcomingEvents.class);
        startActivity(intent);
    }
}
