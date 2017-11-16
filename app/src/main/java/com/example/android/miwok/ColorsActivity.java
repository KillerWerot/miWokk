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
        colors.add(new Word("Where are you going?", "minto wuksus"));
        colors.add(new Word("What is your name?", "tinnә oyaase'nә"));
        colors.add(new Word("My name is...", "oyaaset..."));
        colors.add(new Word("How are you feeling?","michәksәs?"));
        colors.add(new Word("I’m feeling good.",  "kuchi achit"));
        colors.add(new Word("Are you coming?", "әәnәs'aa?"));
        colors.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        colors.add(new Word("I’m coming.", "әәnәm"));
        colors.add(new Word("Let’s go.", "yoowutis"));
        colors.add(new Word("Come here.", "әnni'nem"));


        WordAdapter phrasesAdapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);
    }
}
