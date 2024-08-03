package com.techlabs.structural.adapter.test;

import java.util.Arrays;

import com.techlabs.structural.adapter.model.Biscuit;
import com.techlabs.structural.adapter.model.Chocolate;
import com.techlabs.structural.adapter.model.Hat;
import com.techlabs.structural.adapter.model.HatAdapter;
import com.techlabs.structural.adapter.model.IItem;
import com.techlabs.structural.adapter.model.ShoppingCart;


public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Biscuit biscuit = new Biscuit("Oreo", 2.5);
        Chocolate chocolate = new Chocolate("Cadbury", 3.0);
        Hat hat = new Hat("Puma", "MSports", 10.0, 2.0);
        HatAdapter hatAdapter = new HatAdapter(hat);

        cart.addItem(Arrays.asList(biscuit, chocolate, hatAdapter));
        cart.displayCart();
    }
}

