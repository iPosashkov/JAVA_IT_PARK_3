package com.company;

public class HeightHumanComparator implements HumanComparator {
    @Override
    public int compare (Human human1, Human human2) {
        return human1.getHeight() - human2.getHeight();
    }
}
