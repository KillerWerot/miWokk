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
        family.add(new Word("Where are you going?", "minto wuksus",R.drawable.family_daughter));
        family.add(new Word("What is your name?", "tinnә oyaase'nә",R.drawable.family_father));
        family.add(new Word("My name is...", "oyaaset...",R.drawable.family_grandfather));
        family.add(new Word("How are you feeling?","michәksәs?",R.drawable.family_grandmother));
        family.add(new Word("I’m feeling good.",  "kuchi achit",R.drawable.family_mother));
        family.add(new Word("Are you coming?", "әәnәs'aa?",R.drawable.family_older_brother));
        family.add(new Word("Yes, I’m coming.", "hәә’ әәnәm",R.drawable.family_older_sister));
        family.add(new Word("I’m coming.", "әәnәm",R.drawable.family_son));
        family.add(new Word("Let’s go.", "yoowutis",R.drawable.family_younger_brother));
        family.add(new Word("Come here.", "әnni'nem",R.drawable.family_younger_sister));


        WordAdapter phrasesAdapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);
    }
}
