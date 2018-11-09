package com.test1;

import java.util.List;

public class NameLists {
    private List<String> names;
    public void setNames(List<String> names) {
        this.names = names;
    }
    public void print() {
        for(String name : names) {
            System.out.println(name);
        }
    }
}
