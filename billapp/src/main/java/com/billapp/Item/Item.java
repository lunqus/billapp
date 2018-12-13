package com.billapp.Item;

public class Item {

    // kieki, matavimo vnt.  pavadinimas, kaina be PVM
    // atributas, kuris nurodo preke ar paslauga
    //

    private String name;


    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
