package Common;

import java.util.ArrayList;

public class ArrayFiller{
    
    public static void FillArrayRandom(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            int randomInt = (int) (Math.random() * size);
            a.add(randomInt);
        }
    }

    public static void FillArraySorted(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(i);
        }
    }

    public static void FillArrayReverseSorted(ArrayList<Integer> a, int size) {
        for (int i = 0; i < size; i++) {
            a.add(size - i);
        }

    }
}