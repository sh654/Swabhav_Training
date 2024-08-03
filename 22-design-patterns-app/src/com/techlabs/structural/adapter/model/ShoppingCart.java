package com.techlabs.structural.adapter.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<IItem> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<>();
	}

    public void addItem(List<IItem> newItems) {
       items.addAll(newItems);
    }
    
    public List<IItem> getCartItems(){
    	return items;
    }
    
    public double getCartPrice() {
        double totalPrice = 0;
        for (IItem item : items) {
            totalPrice += item.getItemPrice();
        }
        return totalPrice;
    }
    
    public void displayCart() {
    	System.out.println("Name" + " " + " Price ");
    	for(IItem item: items) {
    		
    		System.out.println(item.getItemName() +" "+ item.getItemPrice());
    	}
    	System.out.println("Total Price: " +getCartPrice());
    }
	
}
