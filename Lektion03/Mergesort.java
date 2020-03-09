package Lektion03;

import java.util.ArrayList;

class Mergesorter {

    ArrayList<Integer> array = new ArrayList<Integer>();

    public void Merge(ArrayList<Integer> A, int p, int q, int r) {

        int n1 = q - p + 1;
        int n2 = r - q;
        System.out.println(n1 + " " + n2);
        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            L.add(i, A.get(p + i));
        }
        for (int i = 0; i < n2; i++) {
            R.add(i, A.get(q + 1 + i));
        }

        int i = 0;
        int j = 0;
        for (int k = p; k <= r; k++) {
            if (i >= n1) {
                A.remove(k);
                A.add(k, R.get(j));
                j++;
            } else if (j >= n2) {
                A.remove(k);
                A.add(k, L.get(i));
                i++;
            } else if (L.get(i) <= R.get(j)) {
                A.remove(k);
                A.add(k, L.get(i));
                i++;
            } else {
                A.remove(k);
                A.add(k, R.get(j));
                j++;
            }
        }
        System.out.println(A);
    }

    public void MergeSort(ArrayList<Integer> A, int p, int r) {
        if (p < r) {
            int q = (r + p) / 2;
            MergeSort(A, p, q);
            MergeSort(A, q + 1, r);
            Merge(A, p, q, r);
        }
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

class Runner {
    public static void main(String[] args) {
        Mergesorter sorter = new Mergesorter();
        ArrayList<Integer> a = new ArrayList<>();
        sorter.FillArrayRandom(a, 8);
        System.out.println(a);

        sorter.MergeSort(a, 0, a.size() - 1);
        System.out.println(a);

    }
}
