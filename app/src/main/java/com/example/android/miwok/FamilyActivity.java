package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Where are you going?", "minto wuksus"));
        family.add(new Word("What is your name?", "tinnә oyaase'nә"));
        family.add(new Word("My name is...", "oyaaset..."));
        family.add(new Word("How are you feeling?","michәksәs?"));
        family.add(new Word("I’m feeling good.",  "kuchi achit"));
        family.add(new Word("Are you coming?", "әәnәs'aa?"));
        family.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        family.add(new Word("I’m coming.", "әәnәm"));
        family.add(new Word("Let’s go.", "yoowutis"));
        family.add(new Word("Come here.", "әnni'nem"));


        WordAdapter phrasesAdapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);
    }
}
