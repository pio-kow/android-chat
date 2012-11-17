package com.pkowalczyk.wifichat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SelectionActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_selection, menu);
        return true;
    }
}
