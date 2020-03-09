package Lektion04;

import java.util.ArrayList;

class QuickSorter{

    
    public void Quicksort(ArrayList<Integer> A, int p, int r){
        if(p < r){
            int q = Partition(A, p, r);
            Quicksort(A, p, q-1);
            Quicksort(A, q+1, r);
        }
    }

    public int Partition(ArrayList<Integer> A, int p, int r){
        int x = A.get(r);
        int i = p - 1;
        int temp;
        for(int j = p; j <= r - 1; j++){
            if(A.get(j) <= x){
                i++;
                temp = A.get(i);
                A.set(i, A.get(j));
                A.set(j, temp);
            }
        }
        temp = A.get(i+1);
        A.set(i+1, A.get(r));
        A.set(r, temp);
        return i + 1;
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

class Main{
    public static void main(String[] args) {
        QuickSorter sorter = new QuickSorter();
        ArrayList<Integer> a = new ArrayList<>();
        sorter.FillArrayRandom(a, 8);
        System.out.println(a);

        sorter.Quicksort(a, 0, a.size() - 1);
        System.out.println(a);

    }
}