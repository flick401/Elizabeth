/*package com.example.elizabeth_pizza_app;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.BaseExpandableListAdapter;

public class menu_Adapter extends BaseExpandableListAdapter {
//private ArrayList<Menu_item> menu = new ArrayList<Menu_item>();
private Activity activity;
private ArrayList<Object> child_items;
private LayoutInflater inflater;
private ArrayList<String> parent_items, child;
public menu_Adapter(ArrayList<String> parents, ArrayList<Object> childern)
{
    this.parent_items = parents;
    this.child_items = childern;
}

public void setInflater(LayoutInflater inflater, Activity activity) 
{
    this.inflater = inflater;
    this.activity = activity;
}

@Override
public Object getChild(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public long getChildId(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public View getChildView(int groupPosition, final int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
	child = (ArrayList<String>) child_items.get(groupPosition);
	Textview textview = null;
	if (convertView==null){
		convertView == inflater.inflate (R.id.textViewChild., root)
	}
	return null;
}

@Override
public int getChildrenCount(int arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Object getGroup(int arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getGroupCount() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public long getGroupId(int arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public View getGroupView(int arg0, boolean arg1, View arg2, ViewGroup arg3) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean hasStableIds() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isChildSelectable(int arg0, int arg1) {
	// TODO Auto-generated method stub
	return false;
}
*/