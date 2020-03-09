package Lektion02;

import java.util.ArrayList;

class SortClass {

    void InsertionSort(ArrayList<Integer> a) {

        long startTime = System.currentTimeMillis();
        for (int i = 1; i < a.size(); i++) {
            int key = a.get(i);
            int j = i - 1;
            while ((j >= 0) && (a.get(j) > key)) {
                a.remove(j + 1);
                a.add(j + 1, a.get(j));
                j--;

            }
            a.remove(j + 1);
            a.add(j + 1, key);

        }
        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println(timeElapsed + " millisec");
    }

    void FillArrayRandom(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            int randomInt = (int) (Math.random() * 20);
            a.add(randomInt);
        }
    }

    void FillArraySorted(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(i);
        }
    }

    void FillArrayReverseSorted(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(size - i);
        }

    }
}

class Opgave1 {
    public static void main(String[] args) {
        SortClass sorter = new SortClass();
        // ArrayList<Integer> a2 = new ArrayList<Integer>();
        // sorter.FillArraySorted(a2, 400000);
        // sorter.InsertionSort(a2);
        // ArrayList<Integer> a1 = new ArrayList<Integer>();
        // sorter.FillArrayReverseSorted(a1, 2800);
        // sorter.InsertionSort(a1);
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        sorter.FillArrayRandom(a2, 20000);
        sorter.InsertionSort(a2);

    }
}
