package com.example.gagandeepbansal.myapplication;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by gagandeepbansal on 18-08-2016.
 */
public class GuestListDialog extends DialogFragment {

    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.guest_list, null);

        ListView guestList = (ListView) view.findViewById(R.id.guest_list);
        String[] guests = getResources().getStringArray(R.array.guests);
        ArrayAdapter<String> array = new ArrayAdapter<String>(getActivity().getApplicationContext(),
                R.layout.simple_list_item,
                guests);
        guestList.setAdapter(array);
        getDialog().setTitle("Guest List");
        getDialog().setCancelable(true);

        return view;
    }
}
