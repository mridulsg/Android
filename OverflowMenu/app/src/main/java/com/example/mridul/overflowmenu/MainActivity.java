package com.example.mridul.overflowmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout Main=(RelativeLayout)findViewById(R.id.Main);
        switch (item.getItemId()){
            case R.id.Menu_Red:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Main.setBackgroundColor(Color.RED);
                return true;
            case R.id.Menu_Yellow:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Main.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.Menu_Green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                Main.setBackgroundColor(Color.GREEN);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
