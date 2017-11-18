package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);

        ListView lista = (ListView) findViewById(R.id.list);
        lista.setBackgroundResource(R.color.category_colors);

        final ArrayList<Word> colors = new ArrayList<Word>();
        colors.add(new Word("Black", "kululli", R.drawable.color_black, R.raw.color_black));
        colors.add(new Word("Brown", "ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new Word("Dusty Yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new Word("Gray","topippi?",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new Word("Green",  "chokokki",R.drawable.color_green,R.raw.color_green));
        colors.add(new Word("Mustard Yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));
        colors.add(new Word("Red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colors.add(new Word("White", "kelelli",R.drawable.color_white,R.raw.color_white));

        WordAdapter phrasesAdapter = new WordAdapter(this, colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(phrasesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word currentSound = colors.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(ColorsActivity.this, currentSound.getAudioResource());
                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        releaseMediaPlayer();
                    }
                });
            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }
}
