package com.example.vibrateandplaymusic;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer fartSoundMP = MediaPlayer.create(this, R.raw.fart);

        Button playFart = (Button) this.findViewById(R.id.buttonMusic);

        playFart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                fartSoundMP.start();
            }
        });
    }

    public void pushMe (View v){
        Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(5000);

    }
}
