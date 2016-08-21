package com.example.gagandeepbansal.myapplication;

import android.os.AsyncTask;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 * Created by gagandeepbansal on 31-07-2016.
 */


public class Async extends AsyncTask<String, Void, String> {

    @Override
    protected String doInBackground(String... params) {

        RestTemplate template = new RestTemplate();
        template.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        final String url = "https://abc.com/user/9899911412";
        ResponseEntity<Response> abc = null;
        abc = template.getForEntity(url, Response.class);
        System.out.print(abc.getBody().getBody());
        return abc.toString();

    }

    @Override
    protected void onPostExecute(String result) {

    }

    @Override
    protected void onPreExecute() {}

    @Override
    protected void onProgressUpdate(Void... values) {}
}