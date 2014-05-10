package com.example.elizabeth_pizza_app;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Pizza_Menu extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pizza_menu);
		// make a list to hold the types of pizzas
		List<String> pizzas = new ArrayList<String>();
		pizzas.add("Large");
		pizzas.add("Medium");
		pizzas.add("Small");
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, pizzas);
		
		ListView menuListView = (ListView)findViewById(R.id.pizzalistView1);
		menuListView.setAdapter(adapter);
		
	}
}
