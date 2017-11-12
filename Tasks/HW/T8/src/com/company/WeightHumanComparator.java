package com.company;

public class WeightHumanComparator implements HumanComparator {
    @Override
    public int compare (Human human1, Human human2) {
        return human1.getWeight() - human2.getWeight();
    }
}