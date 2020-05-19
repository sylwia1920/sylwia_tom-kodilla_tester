package com.kodilla.execution_model;

import java.util.ArrayList;
import java.util.List;

public class Invoice {

    private List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public Item getItems(int index) {
        if (items.size()>0 && index < items.size() && index > 0) {
            return items.get(index);
        } else {
            return null;
        }
    }

    public void clear() {
        items.clear();
    }

    public int getSize(){
        return items.size();
    }


}


