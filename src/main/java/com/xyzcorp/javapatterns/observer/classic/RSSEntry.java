package com.xyzcorp.javapatterns.observer.classic;

/**
 * @author John Ericksen
 */
public class RSSEntry {

    private String value;

    public RSSEntry(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
