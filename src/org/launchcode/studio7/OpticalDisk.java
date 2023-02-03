package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class OpticalDisk implements Readable, Spinnable {

    private final int diameter;
    private final int capacity;
    private final String type;
    private final ArrayList<String> contents;

    public OpticalDisk(int diameter, int capacity, String type, ArrayList<String> contents) {
        this.diameter = diameter;
        this.capacity = capacity;
        this.type = type;
        this.contents = contents;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

    public String[] getMetadata() {

        // TODO get list of all metadata headings.

        return new String[] {type, speed, capacity};
    }

    public String getIndex(int index) {
        if (index > this.getContents().size()) {
            return "";
        }

        return this.getContents().get(index);
    }

    @Override
    public String[] read() {
        return this.getContents().toArray(new String[0]);
    }

    public abstract int[] getSpeed();
}
