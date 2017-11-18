package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);



        ListView lista = (ListView) findViewById(R.id.list);
        lista.setBackgroundResource(R.color.category_family);


        final ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("Daughter", "tune",R.drawable.family_daughter, R.raw.family_daughter));
        family.add(new Word("Father", "әpә",R.drawable.family_father,R.raw.family_father));
        family.add(new Word("Grandfather", "paapa",R.drawable.family_grandfather,R.raw.family_grandfather));
        family.add(new Word("Grandmother","ama",R.drawable.family_grandmother,R.raw.family_grandmother));
        family.add(new Word("Mother","әṭa",R.drawable.family_mother,R.raw.family_mother));
        family.add(new Word("Older Brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        family.add(new Word("Older Sister", "tete",R.drawable.family_older_sister,R.raw.family_older_sister));
        family.add(new Word("Son", "angsi",R.drawable.family_son,R.raw.family_son));
        family.add(new Word("Younger Brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        family.add(new Word("Younger Sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));


        WordAdapter phrasesAdapter = new WordAdapter(this, family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentSound = family.get(position);
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, currentSound.getAudioResource());
                mediaPlayer.start();

            }
        });
    }
}
