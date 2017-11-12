package com.company;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Человек1", 25, 190, 90);
        Human human2 = new Human("Человек2", 23, 180, 80);
        Human humans[] = {human1, human2};

        HumanComparator ageComparator = new AgeHumanComparator();
        // HumanComparator heightComparator = new HeightHumanComparator();
        // HumanComparator weightComparator = new WeightHumanComparator();
        HumanSorter ageSorter = new BubbleSorter();
        // HumanSorter heightSorter = new BubbleSorter();
        // HumanSorter weightSorter = new BubbleSorter();

        ageSorter.sort(ageComparator, humans);
        // heightSorter.sort(heightComparator, humans);
        // weightSorter.sort(weightComparator, humans);

        for (int i = 0; i < humans.length; i++) {
            System.out.println("Имя: " + humans[i].getName() + ". Возраст: " + humans[i].getAge() + ". Рост: " + humans[i].getHeight() + ". Вес: " + humans[i].getWeight());
        }

    }
}
