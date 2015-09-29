package com.example.mt1556ys.bluegreenfragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private int fragmentDisplayed = R.id.blue_fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateFragment();

        View v = findViewById(android.R.id.content);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                updateFragment();
            }
        });
    }

    private void updateFragment() {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        //If blue fragment is shown, replace with green fragment
        if (fragmentDisplayed == R.id.blue_fragment) {
            GreenFragment greenFragment = new GreenFragment();
            ft.replace(android.R.id.content, greenFragment);
            fragmentDisplayed = R.id.green_fragment;
        }

        //Otherwise, are showing green fragment
        //replace with blue fragment
        else {
            BlueFragment blueFragment = new BlueFragment();
            ft.replace(android.R.id.content, blueFragment);
            fragmentDisplayed = R.id.blue_fragment;
        }

        ft.commit(); //Need to call commit() to apply the changes
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
