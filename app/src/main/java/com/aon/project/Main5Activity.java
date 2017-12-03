package com.aon.project;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class Main5Activity extends AppCompatActivity {
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        final VideoView video = (VideoView) findViewById(R.id.video);
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=0QDdRSkL0Qk");
        video.setVideoURI(uri);
        video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                video.start();
            }
        });
    }
}
