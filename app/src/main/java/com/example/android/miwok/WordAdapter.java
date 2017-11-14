package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by KillerWerot on 14/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

}
