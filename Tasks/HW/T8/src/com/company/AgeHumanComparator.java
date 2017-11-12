package com.company;

public class AgeHumanComparator implements HumanComparator {
    @Override
    public int compare (Human human1, Human human2) {
        return human1.getAge() - human2.getAge();
    }
}
