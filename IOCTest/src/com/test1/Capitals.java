package com.test1;

import java.util.Map;

public class Capitals {
    private Map<String, String> capitals;
    public void setCapitals(Map<String, String> capitals) {
        this.capitals = capitals;
    }
    public void print() {
        for(Map.Entry<String, String> elem : capitals.entrySet()) {
            System.out.println(elem.getKey() + "---->" + elem.getValue());
        }
    }
}
