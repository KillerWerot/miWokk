package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Where are you going?", "minto wuksus", R.drawable.color_black));
        colors.add(new Word("What is your name?", "tinnә oyaase'nә",R.drawable.color_brown));
        colors.add(new Word("My name is...", "oyaaset...",R.drawable.color_dusty_yellow));
        colors.add(new Word("How are you feeling?","michәksәs?",R.drawable.color_gray));
        colors.add(new Word("I’m feeling good.",  "kuchi achit",R.drawable.color_green));
        colors.add(new Word("Are you coming?", "әәnәs'aa?",R.drawable.color_mustard_yellow));
        colors.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.drawable.color_red));
        colors.add(new Word("I’m coming.", "әәnәm",R.drawable.color_white));


        WordAdapter phrasesAdapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);
    }
}
