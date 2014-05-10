package com.example.elizabeth_pizza_app;

public class Menu_item {
	private String item_name;
	private String item_notes;
	
public Menu_item(String item_name, String item_notes){
	this.item_name=item_name;
	this.item_notes=item_notes;
	
}
public String getItem_name(){return item_name;}
public void setItem_name(String item_name){this.item_name=item_name;}
public String getItem_notes(){return item_notes;}
public void setItem_notes(String item_notes){this.item_notes= item_notes;}


}
