package com.wass08.vlcsimpleplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MediaSelector extends Activity {

    private EditText        urlGetter;
    private TextView        buttonStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_selector);
        urlGetter = (EditText)findViewById(R.id.url_getter);
        buttonStart = (TextView)findViewById(R.id.button_start);
        buttonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toFullscreen = new Intent(MediaSelector.this, FullscreenVlcPlayer.class);
                Bundle b = new Bundle();

                // Pass the url from the input to the player
                b.putString("url", urlGetter.getText().toString());
                toFullscreen.putExtras(b); //Put your id to your next Intent
                startActivity(toFullscreen);
            }
        });
    }



}
