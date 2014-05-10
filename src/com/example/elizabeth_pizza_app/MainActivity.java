package com.example.elizabeth_pizza_app;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
Button order_button;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		order_button =(Button) findViewById(R.id.order_button);
		order_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {7
				Intent ordering_screen = new Intent(MainActivity.this, Order_menu.class);
				startActivity(ordering_screen);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
