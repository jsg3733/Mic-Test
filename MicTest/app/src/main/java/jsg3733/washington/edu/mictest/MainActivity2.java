package jsg3733.washington.edu.mictest;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity2 extends ActionBarActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        ImageView soundClick = (ImageView) findViewById(R.id.imgSound);
        soundClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity2.this, Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath()
                        + "/myaudio.3gp"));
                mp.start();
            }
        });

        Button playMP3 = (Button) findViewById(R.id.btnMusic);
        playMP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp =  MediaPlayer.create(MainActivity2.this, R.raw.test);
                mp.start();
            }
        });

        Button stopMusic = (Button) findViewById(R.id.btnStopMusic);
        stopMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
