package com.example.android.miwok;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.words_list);


        ListView lista = (ListView) findViewById(R.id.list);
        lista.setBackgroundResource(R.color.category_numbers);


        final ArrayList<Word> numbers = new ArrayList<Word>();
        numbers.add(new Word("one", "lutti",R.drawable.number_one, R.raw.number_one));
        numbers.add(new Word("two", "ottiko",R.drawable.number_two,R.raw.number_two));
        numbers.add(new Word("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new Word("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        numbers.add(new Word("five", "massokka",R.drawable.number_five,R.raw.number_five));
        numbers.add(new Word("six", "temmokka",R.drawable.number_six,R.raw.number_six));
        numbers.add(new Word("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new Word("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new Word("nine", "wo'e",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new Word("ten", "na'aacha",R.drawable.number_ten,R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numbers.get(position);
                releaseMediaPlayer();
                mediaPlayer = MediaPlayer.create(NumbersActivity.this,word.getAudioResource() );
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

