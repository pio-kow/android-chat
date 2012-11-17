package com.pkowalczyk.wifichat;

import com.googlecode.androidannotations.annotations.*;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


@EActivity(R.layout.activity_selection)
public class SelectionActivity extends Activity implements OnClickListener{
	
	@ViewById(R.id.hostButton)
	private Button hostButton;
	
	@ViewById
	private Button joinButton;
	

   @Override
    public void onCreate(Bundle savedInstanceState) {
	   super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_selection);
     //  this.hostButton.setOnClickListener(this);
     //  this.joinButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_selection, menu);
        return true;
    }
    
   
    
    public void onClick(View v){
    	Intent chatActivity = new Intent(this, ChatActivity.class);
    	startActivityForResult(chatActivity, 1);
    }
    
}
