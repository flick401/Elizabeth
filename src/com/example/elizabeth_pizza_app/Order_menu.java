package com.example.elizabeth_pizza_app;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.app.ExpandableListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;


public class Order_menu extends Activity {
	//private ArrayList<String> parentItems = new ArrayList<String>();
	//private ArrayList<Object> childItems = new ArrayList<Object>();
	
	@Override
	protected void onCreate(Bundle Luigilovebacon) {
		super.onCreate(Luigilovebacon);
		setContentView(R.layout.order_menu);
		
		// make a list
		List<String> menu = new ArrayList<String>();
		// add items to the list
		menu.add("Pizza");
		menu.add("Calzones");
		menu.add("Pasta");
		// have an adapter that that takes in a context, a resource (built in in this case) , a textViewResourceId, and an arraylist object
		// Context: you call it to get information regarding another part of your program (activity, package/application)
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, menu);
		
			//attach Listview the list view in the xml
	ListView menuListView = (ListView)findViewById(R.id.menulistView1);
	// set the adapter
	menuListView.setAdapter(adapter);
	menuListView.setOnItemClickListener(new OnItemClickListener() {

		@Override
		public void onItemClick(AdapterView<?> adapter, View view, int itemnumber,
				long id) {
			Intent Pizza_int = new Intent(view.getContext(), Pizza_Menu.class);
			startActivity(Pizza_int);
			// TODO Auto-generated method stub
			
		}
	});
	
	
	/*public void setGroupParents(){
		parentItems.add("Pizza");
		parentItems.add("Calzones");
		
	}
public void setchildData(){
	//ArrayList<String> child = new arrayList<String>();
	child.add("1 topping");
	childItems.add(child);
	child = new ArrayList<String>();
	child.add("hamburger");
	}
}
*/
	}}